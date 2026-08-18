# Revue de la PR : `feat/split-kffi-from-wgpu4k-native`

Commit revu : `4d5586e`  
Périmètre : code, configuration de build et CI. La documentation est exclue de cette revue.

## Verdict

La PR ne devrait pas être approuvée en l'état : elle comporte cinq problèmes **P1** (bloquants) et deux problèmes **P2**.

## Problèmes bloquants (P1)

### 1. Le fallback Android `callGeneric` ne respecte pas la signature native

Fichier : [`kffi-android-native/src/main/cpp/kffi_engine.c`](kffi-android-native/src/main/cpp/kffi_engine.c#L603-L648)

`callGeneric` reçoit `typeSpec`, mais l'ignore. Tous les arguments et la valeur de retour sont déclarés à libffi comme `uint64_t` et les arguments sont lus avec un stride fixe de 8 octets.

Conséquences :

- les appels avec `float` ou `double` ne respectent pas l'ABI ;
- les structures passées par valeur sont tronquées ou mal alignées ;
- le commentaire du code indique lui-même que 43 sites génériques sur 44 sont concernés par les structures passées par valeur.

Le CIF libffi et les buffers doivent être construits à partir de `typeSpec`, ou ces signatures ne doivent pas utiliser ce fallback avant son implémentation complète.

### 2. Le support 32 bits Android est incohérent

Fichiers :

- [`kffi-android-native/build.gradle.kts`](kffi-android-native/build.gradle.kts#L20-L22)
- [`kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryBuffer.android.kt`](kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryBuffer.android.kt#L43-L52)
- [`kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryAllocator.android.kt`](kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryAllocator.android.kt#L79-L83)

L'artefact inclut `armeabi-v7a`, donc une ABI avec des pointeurs de 4 octets. Pourtant :

- `readPointer` et `writePointer` vérifient toujours 8 octets ;
- la lecture 32 bits fait une extension de signe avec `getInt().toLong()` au lieu d'une extension zéro ;
- `bufferOfAddresses` réserve et espace les pointeurs avec un stride de 8 octets.

Ainsi, un buffer pointeur 32 bits valide est refusé, les pointeurs dont le bit de poids fort est fixé deviennent négatifs, et un `void**` natif lit des entrées erronées après la première.

La largeur et le stride doivent dériver de `AndroidUnsafe.addressSize()` partout.

### 3. Les tailles `ULong` non représentables peuvent provoquer des écritures hors allocation

Fichier : [`kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryAllocator.android.kt`](kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryAllocator.android.kt#L76-L77)

`allocateBuffer` convertit directement la taille `ULong` en `Long`. Pour `ULong.MAX_VALUE`, cette conversion donne `-1`. L'alignement de l'arène déborde alors et l'arène peut réserver son bloc minimal tout en créant un `MemoryBuffer` déclaré de taille `ULong.MAX_VALUE`.

Les contrôles de bornes autorisent ensuite des accès qui dépassent l'allocation réelle.

Il faut valider la conversion `ULong` vers `Long` et protéger le calcul d'alignement contre les overflows avant l'allocation.

### 4. Les tests Android hôte ne sont pas découverts

Fichier : [`kffi/build.gradle.kts`](kffi/build.gradle.kts#L352-L362)

La configuration active JUnit Platform pour `jvmTest` et pour `testDebugUnitTest`. Cette dernière tâche n'existe pas avec le plugin Kotlin Multiplatform Android employé ici ; la tâche réelle est `testAndroidHostTest`.

Les tests Kotest sous `androidHostTest` compilent, mais ne sont pas exécutés. Un lancement local de `:kffi:testAndroidHostTest` a produit un rapport ne contenant que le conteneur Gradle, sans suite de tests découverte.

Configurer explicitement `testAndroidHostTest` avec `useJUnitPlatform()`.

### 5. La CI n'exécute aucun test Android

Fichier : [`.github/workflows/ci.yml`](.github/workflows/ci.yml#L38-L39)

Le workflow principal ne lance que `:kffi:jvmTest`. Les tests Android hôte et les tests instrumentés de `kffi` ne sont donc jamais exécutés. Le workflow benchmark assemble un APK instrumenté, mais ne l'exécute pas.

Après correction de la découverte des tests hôte, la CI doit lancer `:kffi:testAndroidHostTest`. Elle doit également lancer les tests instrumentés, par exemple via un émulateur et `:kffi:connectedAndroidDeviceTest`.

## Problèmes importants (P2)

### 6. Les contrôles de bornes peuvent déborder

Fichiers concernés :

- [`kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryBuffer.android.kt`](kffi/src/androidMain/kotlin/org/graphiks/kffi/MemoryBuffer.android.kt#L14-L20)
- [`kffi/src/jvmMain/kotlin/org/graphiks/kffi/MemoryBuffer.jvm.kt`](kffi/src/jvmMain/kotlin/org/graphiks/kffi/MemoryBuffer.jvm.kt#L79-L85)
- [`kffi/src/nativeMain/kotlin/org/graphiks/kffi/MemoryBuffer.native.kt`](kffi/src/nativeMain/kotlin/org/graphiks/kffi/MemoryBuffer.native.kt#L48-L54)

Les expressions du type `offset + width > size` et les multiplications de tailles de tableaux peuvent déborder en `ULong`, redevenir petites et laisser passer un accès hors limites.

Utiliser des comparaisons qui ne débordent pas : vérifier d'abord que la largeur est inférieure ou égale à la taille, puis que `offset <= size - width`.

### 7. Les trampolines d'upcall Android ne sont pas libérés

Fichiers concernés :

- [`kffi-benchmark-android/src/androidDeviceTest/kotlin/org/graphiks/kffi/benchmark/android/AndroidHarness.kt`](kffi-benchmark-android/src/androidDeviceTest/kotlin/org/graphiks/kffi/benchmark/android/AndroidHarness.kt#L146-L172)
- [`kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallEngineTest.kt`](kffi/src/androidDeviceTest/kotlin/org/graphiks/kffi/engine/UpcallEngineTest.kt#L38-L69)

`UpcallEngine.allocateTrampoline` réserve un slot libffi et une global reference JNI. Les appels existants ferment la `CallbackRegistration`, mais ne libèrent jamais le trampoline avec `UpcallEngine.freeTrampoline`.

Avant la libération, le code doit retirer le callback côté natif, fermer la registration, établir la quiescence (`isQuiescent`), puis appeler `freeTrampoline`.

## Vérifications effectuées

| Vérification | Résultat |
| --- | --- |
| `./gradlew :kffi:jvmTest` | 116 tests réussis ; 1 test Gradle agrégé ignoré |
| `./gradlew :kffi:testAndroidHostTest` | Build réussi, mais aucune suite applicative découverte |
| `./gradlew :kffi:assembleAndroidDeviceTest` | Réussi pour `arm64-v8a`, `armeabi-v7a` et `x86_64` |
| `git diff --check origin/master...HEAD` | Réussi |
| GitHub Actions | Ubuntu, Windows, Android assemble, native compile et PR policy verts ; macOS et benchmark encore en attente lors de la revue |


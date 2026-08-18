# Documentation kffi

`kffi` est un runtime Kotlin Multiplatform d’interface de fonctions étrangères
(FFI) pour l’accès mémoire natif et les appels vers des bibliothèques C.
[kextract](https://github.com/klang-toolkit/kextract) génère les bindings ; ce
dépôt contient le runtime et ses modules de benchmark.

## Commencer ici

- Suivez le [Quickstart](quickstart.md) pour intégrer kffi dans un projet JVM,
  Android ou Kotlin/Native.
- Consultez le [README](https://github.com/Graphiks-org/kffi#readme) pour le
  contrat complet, les plateformes prises en charge et le cycle de vie des
  callbacks.
- Parcourez la référence API générée depuis le module `:kffi`.

## Vérification locale

### Tests JVM

```bash
./gradlew :kffi:jvmTest
```

### Générer l’API et compiler le site

```bash
./gradlew :docs:embedDokkaIntoMkDocs
mkdocs build -f docs/mkdocs.yml
```

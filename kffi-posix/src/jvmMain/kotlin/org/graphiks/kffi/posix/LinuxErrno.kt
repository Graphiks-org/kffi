package org.graphiks.kffi.posix

import org.graphiks.kffi.posix.generated.EAGAIN as generatedEagain
import org.graphiks.kffi.posix.generated.EINTR as generatedEintr
import org.graphiks.kffi.posix.generated.EINVAL as generatedEinval
import org.graphiks.kffi.posix.generated.ENOMEM as generatedEnomem
import org.graphiks.kffi.posix.generated.ENOSYS as generatedEnosys

/** Linux errno values sourced from the generated libc header bindings. */
object LinuxErrno {
    val EINTR: Int get() = generatedEintr()
    val EAGAIN: Int get() = generatedEagain()
    val ENOMEM: Int get() = generatedEnomem()
    val EINVAL: Int get() = generatedEinval()
    val ENOSYS: Int get() = generatedEnosys()
}

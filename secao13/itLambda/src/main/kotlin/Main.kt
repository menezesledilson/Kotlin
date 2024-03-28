fun main() {
    val x = 3

    val r = runIfTrue(x > 5) {
        println("code executed")
        x
    }
    println(r)
}

fun runIfTrue(condition: Boolean, code: () -> Any?): Any? {
    if (condition) {
        return code()
    } else {
        return null
    }
}

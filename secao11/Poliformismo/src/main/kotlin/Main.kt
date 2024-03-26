fun main() {
    val a = Programmer()
    a.work()

    val b = KotlinProgrammer()
    b.work()

    var c: Programmer = KotlinProgrammer()
    c.work()

    c = Programmer()
    c.work()

    var d: Programmer = KotlinProgrammer()
    var e: Programmer = Programmer()
    d.work()
    e.work()
}

abstract class Employee {
    abstract fun work()
}

open class Programmer : Employee() {
    override fun work() {
        println("Programmer working...")
    }
}

open class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }
}

class KotlinProgrammer : Programmer() {
    override fun work() {
        println("Kotlin programmer working...")
    }
}

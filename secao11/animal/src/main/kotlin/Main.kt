fun main() {
    val a: Dog = Dog()
    a.run()
    a.eat()

    val b: Animal = Dog()

    if (b is Dog) {
        b.run()
        b.eat()
    }
}

abstract class Animal {

    open fun eat() {
        println("Eating...")
    }
}

class Dog : Animal() {
    fun run() {
        println("Dog Running...")
    }

    override fun eat() {
        println("Eating...")
    }
}

class Cat : Animal() {

    fun sleep() {
        println("Sleeping...")
    }
}
open class Animal(
    val color: String
) {
    fun eat() {
        println("Eating")
    }
}

class Dog(color: String) : Animal(color) {
    fun barck() {
        println("Au-Au")
    }
}

class Cat(color: String) : Animal(color) {
    fun miau() {
        println("Miau")
    }
}
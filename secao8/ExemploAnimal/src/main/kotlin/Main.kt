fun main() {
val animal = Animal("branco")

    val dog = Dog("Preto")
    val cat = Cat("Cinza")

    print(animal is Animal)
    print(dog is Dog)
    print(dog is Animal)

}
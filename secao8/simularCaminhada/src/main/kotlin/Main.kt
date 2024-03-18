fun main() {

    val p1 = Person()

    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.walk()
    p1.drinkWater()

    println("A pessoa andou ${p1.end()} metros")

    val p2 = Person(1000) // Creating a person with an initial distance to water of 1000
    p2.walk()
    p2.drinkWater()
    p2.walk()
    println("A pessoa andou ${p2.end()} metros")
}

private class Person(
    private  val initialDistanceToWater: Int = 5000
){
    private var distance = 0
    private var distanceToWater:Int = initialDistanceToWater

    fun walk() {
        if (distanceToWater > 0) {
            distance += 1000
            distanceToWater -= 1000
        }
    }

    fun drinkWater() {

        distanceToWater = initialDistanceToWater
    }

    fun end(): Int {
        return distance
    }
}

class Circle(val radius: Double) {
    fun surface() = Math.PI * radius * radius
}

fun main() {
    val circles = arrayOf(
        Circle(1.0),
        Circle(3.0),
        Circle(6.0)
    )

    // Using repeat function
    repeat(circles.size) {
        val circle = circles[it]
        val surface = circle.surface()
        println(surface)
    }

    // Using for loop
    for (i in circles.indices) {
        val circle = circles[i]
        val surface = circle.surface()
        println(surface)
    }

    // Using forEach loop
    circles.forEach {
        println(it.surface())
    }
}

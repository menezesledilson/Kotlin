fun main() {
    val l1 = listOf(1, 2, 3, 4, 5)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1, 2, 3)

    l3.add(1, 2)
    l3.add(10)

    l3.forEach { println() }
}
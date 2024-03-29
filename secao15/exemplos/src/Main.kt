class Person(val name: String, val age: Int) {
    companion object {
        fun data(): List<Person> {
            return listOf(
                Person("Pedro", 25),
                Person("Manoel", 30),
                Person("Gustavo", 10),
                Person("Maria", 32),
                Person("Ricardo", 53),
                Person("Joana", 49),
                Person("Arlindo", 44),
                Person("Roberto", 19)
            )
        }
    }
}

fun main() {
    val maxNameLength = Person
        .data()
        .map { it.name }
        .maxByOrNull { it.length }
    println("Maior nome: $maxNameLength")

    val minAge = Person
        .data()
        .minOf { it.age }
    println("Idade mínima: $minAge")
}

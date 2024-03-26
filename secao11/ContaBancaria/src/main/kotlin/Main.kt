fun main() {
    val person = Person("John", "Doe")
    val account = Account(person)
    account.deposit(100.0)
    account.print()
}

class Account(val owner: Nameable) : Printable {
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }
}

interface Nameable {
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
}

interface Printable {
    fun print()
}

data class Person(
    override val firstName: String,
    override val lastName: String
) : Nameable


fun main() {
    val account = BankAccount()

    try {
        account.deposit(-500.0)
        account.deposit(300.0)

    } catch (e:RuntimeException){
        println("Error: ${e.message}")
    }
    println(account.balance)
}
class BankAccount {
    var balance: Double = 0.00
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        balance += value
    }
    fun withdraw(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }
        if (balance - value < 0) {
            throw InsufficientFundsException(balance)
        }
        balance -= value
    }
}


import com.sun.jdi.Value

fun main() {
    val account = BankAccount()
    account.deposit(500.0)
    println(account.balance)
}

class BankAccount {
    var balance: Double = 0.00
        private set

    fun deposit(value: Double) {
        if (value < 0)
            throw IllegalArgumentException("Valor de depósito não pode ser negativo")

        balance += value
    }

    fun withdraw(value: Double) {
        if (value < 0)
            throw IllegalArgumentException("Valor de retirada não pode ser negativo")

        balance -= value
    }
}

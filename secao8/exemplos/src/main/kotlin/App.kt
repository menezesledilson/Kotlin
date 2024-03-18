fun main() {
    val a1 = Account("1234", "joao")
    val a2 = Account("4455-5", "maria")

    val a3 = Account()
    val a4 = Account("8888-7", "Carlos", 100.0)

    a1.deposit(200.0)
    a2.deposit(150.0)
    a2.deposit(2000.0)


    a1.print()
    a2.print()
    a3.print()
    a4.print()


    a1.print()
}


class Account(  val accountNumber: String  =" ",  val accountOwner: String =" ") {

    private var balance: Double = 0.0

   private  constructor(): this( accountNumber ="", accountOwner = " "){
        print(" construtor( )")
    }

    constructor(accountNumber: String,accountOwner: String,balance:Double):this(accountNumber,accountOwner){
        this.balance = balance
    }
    fun deposit(amount: Double) {
        balance += amount
    }
    fun deposit(amount: Int) {
        balance += amount
    }
    fun print (){
        print("number : $accountNumber; Owner: $accountOwner; Balace: $balance")

    }
}
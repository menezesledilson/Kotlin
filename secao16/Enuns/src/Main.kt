

fun main() {
    val month = Month.MAIO
    println(month.numberOfMonth)

    var nextMonth = month.next()
    println(nextMonth)
}

enum class Month(val numberOfMonth: Int) {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    fun next():Month{
        return  Month
            .values()
            .find { it.numberOfMonth == numberOfMonth + 1 }
            ?:JANEIRO
    }
    fun getTotalDays():Int{
        when (this){
            JANEIRO, MARCO,MAIO,JULHO,AGOSTO,OUTUBRO, DEZEMBRO -> 31
            FEVEREIRO ->28
            else -> 30
        }

    }
}


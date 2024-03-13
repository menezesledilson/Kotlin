fun main( ) {
     println(">")

    val v1 = readln().toDouble()

    println("Digite o valor v1: " + v1 )

    val op = readln()[0]

    println("Digite o sinal + - * / : " + op )

    val v2 = readln().toDouble()
    println("Digite o valor v2: " + v2 )

    val r = when (op){
        '+' -> v1 + v2
        '-' -> v1 - v2
        '*' -> v1 * v2
        '/' -> v1 / v2
         else -> 0
    }
    println("Resultado: $r" )
}
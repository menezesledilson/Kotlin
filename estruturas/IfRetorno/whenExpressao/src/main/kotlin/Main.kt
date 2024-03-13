fun main(args: Array<String>) {

   val x = 10
    println(
        when {
            x > 0 -> "positivo"
            x > 0 -> "negativo"
            else -> "zero"
        }
    )
    val s = 'A'
    val v = when (s){
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }
    println(v)
}
fun main() {
    val x = 20
    when (x) {
        10 -> println("é 10")
        20 -> println("é 20")
        30 -> println("é 30")
        else -> println("Desconhecido")
    }

    when (x) {
        in 0..10 -> println("0 a 10 ")
        in 11..30 -> println("11 a 30")
        else -> println("Outro intervalo")
    }
    when (x){
        0,2,4,6 -> println("Par")
        else -> println("Desconhecido")
    }
}
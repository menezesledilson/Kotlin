import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(0, 101)
    var playing = true
    var n = 0

    while (playing) {
        print(">")
        n = readLine()!!.toInt() // Removi a declaração 'val' aqui

        when {
            n > secret -> println("O número é menor")
            n < secret -> println("O número sorteado é maior")
            else -> playing = false
        }
    }
    println("Parabéns você acertou o número, que era $n")
}

import java.awt.image.ImageProducer

fun main( ) {
    val p={->"hey!"}
     console(p)

    val x = 10

    console {
        val y = (x * 2) * -1
        y +1
    }
}
fun console(producer: ()-> Any){
    println("*****************")
    println(producer())
    println("*****************")


}
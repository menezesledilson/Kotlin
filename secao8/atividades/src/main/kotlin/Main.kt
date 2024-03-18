fun main( ) {
     val g = CharGenerator(min = 'A', max = 'Z')
    println(g.next())
    println(g.next())
    println(g.next())
}
class CharGenerator(
    val min: Char,
    val max: Char
){
    fun next():Char{
     return   (min .. max).random()
    }
}
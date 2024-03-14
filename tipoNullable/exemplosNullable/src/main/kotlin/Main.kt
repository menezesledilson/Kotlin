import sun.jvm.hotspot.oops.CellTypeState.value

fun main() {
    /*val s1 = "abcde"
       println(s1)

       val s2 = s1?.uppercase()
       println(s2)
       val s3 = s2?.reversed()
       println(s3)
   */
    //  val l = s2?.length
    // println(l)
    val i: Int? = null
    //val value2 = if (value != null) value else 0
    // println(value2)


    val value2 = value ?: 0
    println(value2)


}
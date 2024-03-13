fun main( ) {

   for (i in 0 .. 10){
       println(i)
   }
    for ( i in 10 downTo  0 step 2){
        println("$i")
    }

    println("=========")

    for ( i in 10 until 100 step 3){
        println("$i")
    }
}

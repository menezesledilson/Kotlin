fun main() {
   /* for (i in 0..50) {
        if (i % 10 == 0) {
            continue
                }
        println("$i")
    }

    for (i in 0..50) {
        if (i ==20) {
            break
        }
        println("$i")
    }
    println("Fim")*/


    loop@ for (i in 'A'..'E') {
         for (j in 1 .. 5){
             println("$i")

             if(j== 3){
                 //break@loop
                 continue@loop
             }
         }
       println()
    }
    println("\nFIM")
}
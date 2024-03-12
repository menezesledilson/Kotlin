fun main() {
    /*val a = 10.0
    val b = 3.0
    println(a / b)

    val c = 30L
    val d = 20
    println(c * d)
    println(10 / (3).toDouble())*/
    //Operadores relacional

    /*println(10 == 10)
    println(10 != 7)
    println(5 > 2)
    println(5 < 2)
    println(5 <= 2)
    println(5 >= 2)

    //AND as duas tem que ser verdadeira
    println("T AND T  ${true && true}")
    println("T AND T  ${true && false}")
    println("T AND T  ${false && true}")
    println("T AND T  ${false && false}")

    println()
    //OR as duas tem que ser false
    println("T OR T  ${true || true}")
    println("T OR T  ${true || false}")
    println("T OR T  ${false || true}")
    println("T OR T  ${false || false}")


    println()
    //NOT as duas tem que ser false
    println(" NOT F  ${!false}")
    println(" NOT T  ${!true}")


    //operadores de atribuição

    var x = 5

    x +=2
    println(x)


    x -=2
    println(x)


    x *=2
    println(x)

    x /=2
    println(x)

    x++
    println(x)

    x--
    println(x)


    var x = 8
    println(x++)
    println(x)

    var y = 8
    println(y--)
    println(y)

    val exp2 = true && false || true && !false

    println(exp2)*/

    val exp = (5 + 3 ) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3 )

    /*
    * 8 2 <30 /2 || !(4 <=2)
    * 16 < 30 / 2 || !(4 < =2)
    * F || !F
    * F || T
    * T
    * */
println(exp)

    val exp = !(2 * 4 >= 16 /2 && 5 == 4 + 1)
}
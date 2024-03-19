fun main( ) {
val d1 = TV()
    d1.on()
    d1.off()
    println(d1.isOn)

    val d2 = Telephone()
    d2.on()
    d2.off()
    println(d2.isOn)
}
abstract class Device{
    var isOn = false
        private set
    fun on(){
        isOn = true
    }
    fun  off(){
        isOn = false
    }
}

class  TV : Device()

class  Telephone: Device()


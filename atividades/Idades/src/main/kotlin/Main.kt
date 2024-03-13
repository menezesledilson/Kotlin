fun main( ) {

val age = readln().toInt()

    if( age >= 0 && age  <= 12){
        println("Criança")
    }else if (age >= 13 && age <= 17 ){
        println("Adolescente")
    } else if (age >= 18 && age <= 65){
        println("Adulto")
    } else if (age >= 6 && age <= 120){
        println("Senior")
    } else{
        println("Idade inválida")
    }

}
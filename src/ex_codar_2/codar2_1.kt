package ex_codar_2
//Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.

fun main() {
    print("Informe um valor: ")
    var num: Int = readln().toInt()
    print("Informe outro valor: ")
    var num2: Int = readln().toInt()

    if ( num > num2){
        println("O valor $num e o maior entre eles")
    }else{
        println("O valor $num2 e o maior entre eles")
    }
}
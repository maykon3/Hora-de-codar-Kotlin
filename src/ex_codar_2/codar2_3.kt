package ex_codar_2//Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
// e escrever o maior deles.

fun main() {
    print("Digite um numero: ")
    var num1: Int = readln().toInt()
    print("Digite outro numero: ")
    var num2: Int = readln().toInt()
    print("Digite mais um numero: ")
    var num3: Int = readln().toInt()

    if( num1 > num2 && num1 > num3){
        println("O $num1 e o maior deles")
    }else if ( num2 > num1 && num2 > num3){
        println("O $num2 e o maior deles")
    }else if ( num3 > num1 && num3 > num2){
        println("O $num3 e o maior deles")
    }
}
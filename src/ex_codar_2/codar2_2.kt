package ex_codar_2//Faça um programa que leia um valor informado pelo usuário e diga se
// o valor informado é positivo, negativo ou zero.


fun main() {
    print("Informe um valor: ")
    var num: Int = readln().toInt()

    if(num == 0) {
        println("O valor inserido e igual a ZERO ")
    }else if( num > 0 ){
        println("O valor e Positivo ")
    }else {
        println("O valor e Negativo ")
    }

}
package ex_codar_2//Faça um programa que leia 3 valores informados pelo usuário
// (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

fun main() {
    print("Digite um numero: ")
    var num1: Int = readln().toInt()
    print("Digite outro numero: ")
    var num2: Int = readln().toInt()
    print("Digite mais um numero: ")
    var num3: Int = readln().toInt()
    var soma = 0

    if( num1 < num2 && num1 < num3){
        soma = (num2 + num3)
        println(" A soma dos dois maiores e : $soma ")
    }else if ( num2 < num1 && num2 < num3){
        soma = (num1 + num3)
        println(" A soma dos dois maiores e : $soma ")
    }else if ( num3 < num1 && num3 < num2){
        soma =(num1 + num2)
        println(" A soma dos dois maiores e : $soma ")
    }
}
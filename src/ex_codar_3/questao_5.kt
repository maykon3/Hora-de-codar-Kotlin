package ex_codar_3
//Faça um algoritmo que calcule e escreva a média aritmética dos dois
// números inteiros informados pelo usuário e todos os números inteiros entre eles.
// Considere que o primeiro sempre será menor que o segundo

fun main() {

    print("Informe um valor: ")
    var num = readln().toDouble()
    print("Informe outro valor: ")
    var num2 = readln().toDouble()
    var soma = 0.0
    var quantidade = 0

    while(num > num2){
        print("Informe um valor maior que o primeiro: ")
        num2 = readln().toDouble()
    }

    while( num <= num2 ){
        soma = num + soma
        quantidade++
        num++
    }
    soma = soma / quantidade
    println("A media aritmetica dos numeros recebidos é: $soma")
}

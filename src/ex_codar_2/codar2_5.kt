package ex_codar_2//Faça um programa que leia 6 valores informados pelo usuário,
// calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

fun main() {
    var soma = 0
    var media = 0

    for (n in 1..6){
        print("Digite um numero: ")
        val numero:Int = readln().toInt()

        soma = soma + numero
    }
    media = soma / 6
    println("A media dos valores recebidos e: $media")
}
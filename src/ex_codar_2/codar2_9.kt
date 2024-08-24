package ex_codar_2//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem
// que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

fun main() {

    print("Em que ano voce nasceu: ")
    var numero: Int = readln().toInt()
    var ano = 2024
    ano = ano - numero

    while( numero < 1930 || numero > 2024){
        print("Digite uma nova data de nascimento: ")
    }
    if( ano >= 18){
        println("$ano anos, essa e sua idade")
        print("Voce podera votar esse ano")
    }else if (ano < 18){
        println("$ano anos, essa e sua idade")
        print("voce nao pode votar ainda ")
    }

}
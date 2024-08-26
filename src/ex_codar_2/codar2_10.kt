package ex_codar_2

// Tendo como entrada a altura e o gênero designado ao nascer
// (codificado da seguinte forma: 1: feminino - 2: masculino - )]
// de uma pessoa, construa um programa que calcule e imprima seu peso ideal

fun main() {

    var peso = 0.0

    print("Informe a sua altura: ")
    var altura: Double = readln().toDouble()
    println("Informe o gênero que voce nasceu? (1/2)")
    print(" (1: feminino - 2: masculino): ")
    var genero: Int = readln().toInt()
    if(genero == 1 ){
        peso = (62.1 * altura)- 44.7
        print("O peso ideal para você e: $peso")
    }else if(genero == 2){
        peso = (72.7 * altura)- 58
        print("O peso ideal para você e: $peso")
    }


}
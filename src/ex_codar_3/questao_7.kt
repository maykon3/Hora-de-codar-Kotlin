package ex_codar_3
//Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno.
// Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido,
// deve ser solicitado um novo valor ao usuário.

fun main() {
    var list = mutableListOf<Double>()
    var numero = 0.0
    var soma = 0.0
    var media = 0.0

    for(n in 1..6){
        print("Insira as Notas: ")
        numero = readln().toDouble()
        while( numero < 0 || numero >10){
            println("informe um novo valor, entre 0 - 10")
            print("Insira as Notas: ")
            numero = readln().toDouble()
        }
        soma = numero + soma

    }

    media = soma / 6
    println("A media deste aluno e: $media")

}
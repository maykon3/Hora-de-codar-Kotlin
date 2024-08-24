package ex_codar_2// Escreva um programa que calcule a média de quatro números informados pelo usuário,
// mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que
// cinco o usuário receberá uma mensagem "Você passou no teste".
// Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

fun main() {
    var soma: Double = 0.0
    var media = 0.0
    for (n in 1..4){
        print("Digite a nota: ")
        val numero: Double = readln().toDouble()

        if(numero < 0 || numero > 10) {
            println("Digite outro valor maior que 0 e menor que 10")
            print("Digite a nota: ")
            val numero: Double = readln().toDouble()
        }else{
            soma += numero
        }

        }

    media = soma / 4
    if (media > 5){
        print("Você passou no teste !")
    }else{
        print("tente novamente !")
    }

}
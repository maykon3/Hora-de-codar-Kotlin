package ex_codar

fun main() {

    print("Digite o valor da base: ")
    var base : Double = readln().toDouble()

    print("Digite o valor da altura: ")
    var altura :Double = readln().toDouble()

    val area = (base * altura) / 2
    println("O resultado da área do triângulo é: $area")

}
package ex_codar_3
//Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.

fun main() {
    var list = mutableListOf<Int>()
    print("Informe um número para ver sua tabuada: ")
    var numero = readln().toInt()
    var contador = 0
    var result = 0

    for (n in 1..10) {
        contador = contador + 1
        result = numero * contador
        println("$numero * $contador = $result")
    }
    println("")
    while (numero > 1) {
        numero = numero - 1
        contador = 0
        println("")
        for (n in 1..10) {
            contador = contador + 1
            result = numero * contador
            println("$numero * $contador = $result")
        }
    }
}

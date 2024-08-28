package ex_codar_3
//Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado
// for igual ou menor que ZERO, deve ser lido um novo valor.
// Ou seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo.

fun main() {

    var resultado: Float = 0.00f

    print("Informe um valor: ")
    var num = readln().toFloat()
    print("Informe outro valor: ")
    var num2 = readln().toFloat()

    while ( num2 <= 0 ){
        println("Informe um valor acima de zero")
        print("Informe outro valor: ")
        num2 = readln().toFloat()
    }
    resultado = num / num2
    println(" O resultado da divisão: $num / $num2 = $resultado ")
}


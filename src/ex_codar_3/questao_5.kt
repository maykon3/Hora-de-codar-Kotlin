package ex_codar_3
//Faça um algoritmo que calcule e escreva a média aritmética dos dois
// números inteiros informados pelo usuário e todos os números inteiros entre eles.
// Considere que o primeiro sempre será menor que o segundo

fun main() {
    var list = mutableListOf<Double>()

    for(n in 1..2){
        print("Informe a nota: ")
        var numero = readln().toDouble()
        list.add(numero.toDouble())
    }
    print("A media aritmetica dos numeros informado e: ${list.sum()/list.count()}")
}

package ex_codar_3
//Faça um algoritmo que calcule e escreva a
// média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).

fun main() {
    var list = mutableListOf<Double>()

    for (n in 15..100){
       list.add(n.toDouble())
    }
    println("A media aritmetica dos numeros 15 a 100, e: ${list.sum()/list.count()}")
}

package ex_codar_3
//Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os números 24 e 42
// (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

fun main() {
    var list = mutableListOf<Int>()
    var numero = 0
    var entre = 0
    var fora = 0
    for (n in 1..10){
        println("informe valor: ")
        numero = readln().toInt()
        list.add(numero.toInt())
        if (numero < 24 || numero > 42){
            fora++
        }else{
            entre++
        }
    }
    println("os valores informados são: ${list}")
    println("Quantidade entre os valores 24 e 42: $entre")
    println("Quantidade fora dos valores 24 e 42: $fora")
}

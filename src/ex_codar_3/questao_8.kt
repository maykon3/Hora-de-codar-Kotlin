package ex_codar_3
// Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
// Considere que o N será sempre maior que ZERO.
//N  é um valor informado pelo usuário

fun main() {

    print("Informe um valor: ")
    var numero = readln().toInt()
    var numero2 = 1

    while ( numero2 <= numero ){
        print(" $numero2 ,")
        numero2 = numero2 + 1
    }
}

package ex_codar_2//Faça um programa que leia 6 números que o usuário vai informar.
// Todos os números lidos com valor inferior a 72 devem ser somados.
// Escreva o valor final da soma efetuada e também todos valores que o usuário informou.


fun main() {
    var soma = 0
    var listaNumeros: MutableList<Int> = mutableListOf()
    for (n in 1..6){
        print("Digite um valor: ")
        val numero:Int = readln().toInt()
        if(numero < 72){
            soma = soma + numero
        }
        listaNumeros.add(numero)
        }

        println("Os valores informados são: ${listaNumeros} ")
        println("E a soma dos valores inferiores a 72: $soma")

}
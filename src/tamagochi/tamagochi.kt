package tamagochi

import tamagochi.Tamagochi

fun main() {
    println("Bem vindo ao Tamagochi!")
    print(" Insira o nome de seu pet: ")
    val nome = readln() // atribui um nome para o tamagochi que estava sem
    var vulgo = Tamagochi(nome) //vulgo faz a conecxao com a class e o main

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar o $nome")
        println("2. Brincar com $nome")
        println("3. Verificar o Status do $nome")
        println("4. Descansar o $nome")
        println("5. Sair")

        var escolha = readln().toIntOrNull()

        when(escolha) {
            1 -> vulgo.comer()
            2 -> vulgo.brinks()
            3 -> vulgo.status()
            4 -> vulgo.descanso()
            5 -> {
                println("Encerrando tamagochi...")

                return
            }

        }
        if (escolha != 3 ) {
            vulgo.futuro()
        }

        if(vulgo.fome > 99 || vulgo.cansaco > 99 || vulgo.feliz <= 0){
            vulgo.vida = false
            println("Infelizmente $nome foi de Comes e Bebes...")
            return
        }else if ( vulgo.idade > 49){
            println("Você alcançou o objetivo do Tamagochi")
            vulgo.vida = false
        }
    }
}
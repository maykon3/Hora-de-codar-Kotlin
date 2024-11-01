package tamagochi

import tamagochi.Tamagochi

fun main() {
    println("Bem vindo ao Tamagochi!")
    print(" Insira o nome de seu pet: ")
    val nome = readln()
    var vulgo = Tamagochi(nome)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nome")
        println("2. Brincar com $nome")
        println("3. Status do $nome")
        println("4. Sair")

        var escolha = readln().toIntOrNull()

        when(escolha) {
            1 -> vulgo.comer()
            2 -> vulgo.brinks()
            3 -> vulgo.status()
            4 -> {
                println("Encerrando tamagochi...")

                return
            }

        }

        vulgo.futuro()

        if(vulgo.fome > 20 || vulgo.cansaco > 25){
            vulgo.vida = false
            println("Infelizmente $nome foi de vasco...")
            return
        }
    }
}
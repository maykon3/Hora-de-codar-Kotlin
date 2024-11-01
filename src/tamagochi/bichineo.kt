package tamagochi

class Tamagochi( var nome: String, var fome: Int = 10, var feliz: Int = 20, var cansaco: Int = 0, var idade: Int = 2, var vida: Boolean = true) {

    fun comer() {
        fome = fome - 4
        println("Minha fome diminuiu um pouco!!!")
    }

    fun brinks(){
        feliz = feliz + 3
        cansaco = cansaco + 5
        fome = fome + 5
        println("Me sinto mais feliz.")
    }

    fun status (){
        println("$nome \n Fome: $fome\n Felicidade: $feliz\n Cansaço: $cansaco\n Idade: $idade")
    }

    fun futuro() {
        fome += 2
        cansaco += 2
        feliz -= 3
        idade += 1
    }



}
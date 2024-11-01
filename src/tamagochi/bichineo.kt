package tamagochi

class Tamagochi( var nome: String, var fome: Int = 0, var feliz: Int = 100, var cansaco: Int = 0, var idade: Int = 2, var vida: Boolean = true) {

    fun comer() {
        fome = fome - 50
        println("Minha fome diminuiu um pouco!!!")
    }

    fun brinks(){
        feliz = feliz + 10
        cansaco = cansaco + 10
        fome = fome + 5
        println("Me sinto mais feliz.")
    }

    fun status (){
        println("$nome \n Fome: $fome\n Felicidade: $feliz\n Cansaço: $cansaco\n Idade: $idade")
    }
    fun descanso (){
        print("Quanto tempo $nome descansou ? ")
        var dormes = readln().toInt()
        if (dormes == 8){
        cansaco = 0
        }else if (dormes < 8){
            cansaco = (dormes * 5)- cansaco
        }else if ( dormes > 8 || dormes < 0 ){
            println("Valor invalido")
            descanso()
        }
    }

    fun futuro() {
        fome += 30
        cansaco += 10
        feliz -= 30
        idade += 1
    }



}
package ex_codar_4
//Crie uma array de planetas que inclua "Terra", "Marte", "Plutao", "Venus", "Júpiter", "Saturno"  e, em seguida,
// peça ao usuário para digitar o nome de um planeta.
//Verifique se o planeta que o usuário informou está na array e informe ao usuário.

fun main() {
    val SistemaSolar = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
    print("Digite um nome de planeta: ")
    var planeta: String = readln()

    if(SistemaSolar.contains(planeta)){
        print("$planeta está no Sistema Solar: $SistemaSolar")
    }else{
        print("$planeta não está no Sistema Solar")
    }
}

package Hotel

fun eventos (){
    print("Qual o número de convidados para o seu evento? ")
    var convidados = readln().toInt()
    if (convidados > 350 || convidados <= 0){
        println(" Quantidade de convidados superior à capacidade máxima.\n ")
        eventos()
    }else if ( convidados <= 220 ){
        if (convidados <= 150){
            println(" Use o auditório Laranja\n")
            println(" Agora vamos ver a agenda do evento. ")
        }else{
            var cadeira = convidados - 150
            println("")
            println(" Use o auditório Laranja (inclua mais $cadeira cadeiras)\n ")
            println(" Agora vamos ver a agenda do evento. ")
        }

    }else if (convidados > 220){
        println(" Use o auditório Colorado \n")
        println(" Agora vamos ver a agenda do evento. ")
    }

    inicio()
}
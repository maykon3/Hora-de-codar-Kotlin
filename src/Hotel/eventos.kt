package Hotel

fun eventos (){
    var horario = 0
    var empresa: String = ""
    var garcom = 0

    // primeira parte
    print("Qual o número de convidados para o seu evento? ")
    var convidados = readln().toInt()
    if (convidados > 350 || convidados <= 0){
        println(" Número de convidados inválido.\n ")
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
    //segunda parte
    print("Qual o dia do seu evento? ")
    var dia = readln().uppercase()
    if (dia == "SABADO" || dia == "DOMINGO") {
        print(" Qual a hora do seu evento? ")
        horario = readln().toInt()
        if(horario > 15 || horario < 7) {
            println("Horario fora de funcionamento, Auditório indisponível\n")
            println(" Segunda a Sexta das 7hs às 23hs \n Sábados e Domingos apenas das 7hs às 15hs \n")
            eventos()
        }
        print(" Qual o nome da empresa? ")
        empresa = readln()
        println(" Auditório reservado para $empresa . $dia às $horario hs.\n \n")

    } else {
        print(" Qual a hora do seu evento? ")
        horario = readln().toInt()
        while (horario > 23 || horario < 7) {
            println("Horario fora de funcionamento, Auditório indisponível")
            println(" Segunda a Sexta das 7hs às 23hs \n Sábados e Domingos apenas das 7hs às 15hs \n")
            print(" Qual a hora do seu evento? ")
            horario = readln().toInt()
        }

        print(" Qual o nome da empresa? ")
        empresa = readln().uppercase()
        println(" Auditório reservado para $empresa . $dia às $horario hs.\n \n")

    }

    print(" Qual a duração do evento em horas? ")
    var duracao = readln().toInt()
    var conv = convidados / 12
    var func = duracao / 2

    var calculo_garcon = conv + func
    println( " São necessários $calculo_garcon garçons. " )
    var valor_garcom =  calculo_garcon * 10.5
    println(" Custo: R$ $valor_garcom ")

    println("\n Agora vamos calcular o custo do buffet do hotel para o evento.\n " )



   inicio()
}
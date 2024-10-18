package Hotel

import kotlin.system.exitProcess

val senha = 2678
var nome = ""
var login = mutableListOf<String>()
var quartos = mutableListOf(
    "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre", "livre",
    )
val listaHospedes = mutableListOf(
    "Carlos Villagran", "Maria Antonieta de las Nieves", "Roberto Gómez Bolaños", "Florinda Meza", "Ramón Valdés", "Rubén Aguirre", "Angelines Fernández", "Edgar Vivar", "Horácio Gómez Bolaños", "Raúl Padilla"
)
var listaEventos = mutableListOf<String>()

fun main() {

    print("Qual o seu nome: ")
    nome = readln().uppercase()
    login.add(nome)


    print("Digite a sua senha : ")
    var pass = readln().toIntOrNull()
    while (pass != senha ){
        print("Senha Invalida !\n")
        print("Digite a sua senha : ")
        pass = readln().toIntOrNull()
    }
    if (pass == senha){
        inicio()
    }
}

fun login (){
    println(login)
    println("")
}

fun inicio() {

    println(" Bem vindo ao Ibis, $nome. É um imenso prazer ter você por aqui! ")

    println(" Escolha uma opção de cadastro:\n 1. Quartos\n 2. Hospede\n 3. Abastecimento\n 4. Eventos\n 5. Posto\n 6. Ar\n 7. Sair\n 8. Login")

    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> AbastecimentoDeAutomoveis()
        4 -> eventos()
        5 -> posto()
        6 -> ar()
        7 -> sairDoHotel()
        8 -> login()
        else -> erro()
    }
}

fun cadastrarQuartos() {

    print("Qual o valor padrão da diária? ")
    var daily = readln().toDouble()
    while (daily != 55.0 ){
        print( "Valor inválido, $nome\n\n")
        return cadastrarQuartos()
    }

    print(" Quantas diárias serão necessárias? ")
    var estadia = readln().toInt()
    while (estadia > 30 || estadia < 1){
        print( "Valor inválido\n")
        print(" Quantas diárias serão necessárias? ")
        estadia = readln().toInt()
    }
    var hospedagem = 55.0*estadia

    println("\nO valor de $estadia dias de hospedagem é de R$ $hospedagem\n ")

    print(" Qual o nome do hospede? ")
    var name = readln().uppercase()
    listaHospedes.add(name)


    println("Qual quarto você deseja reservar ? (1 - 20) \n")
    var reserva = readln().toInt()
    while (reserva < 1 || reserva > 20){
        println("Valor Invalido")
        println("Qual quarto você deseja reservar ? (1 - 20) \n")
        reserva = readln().toInt()
    }

    if (reserva in 1..20) {
        if (quartos[reserva - 1] == "livre") {
            println("Quarto Livre.")
            print("\n $nome, você confirma a hospedagem para $name por $estadia dias para o quarto $reserva por R$ $hospedagem  (S/N): ")
            var confirma = readln().uppercase()
            if(confirma == "S"){
                quartos[reserva - 1] = "ocupado"
                println("$nome, reserva do quarto $reserva feita com sucesso, para $name!")
            }else{
                println("Tudo bem, quem sabe na proxima!\n")
                inicio()
            }
        }else{
            println("Quarto já está ocupado\n")
            println(" Lista de quartos e suas ocupações ")
            var m = 1
            for (i in quartos) {
                println("Quarto $m, está $i")
                m++
            }
            println("")
            cadastrarQuartos()
        }
    }
    println("")
    inicio()
}

fun AbastecimentoDeAutomoveis() {

}

fun listar(listaHospedes: MutableList<String>){
    println("${listaHospedes}\n")
    cadastrarHospedes()
}

fun cadastrarHospedes() {

    while (true) {
        println("""Cadastro de Hóspedes
            Selecione uma opção:
            1. Cadastrar
            2. Pesquisar
            3. Listar
            4. Sair""")

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> cadastrarHospede(listaHospedes)
            2 -> pesquisarHospede(listaHospedes)
            3 -> listar(listaHospedes)
            4 -> sairCadastroDeHospedes()
            else -> erroCadastroDeHospedes()
        }
    }
}

fun cadastrarHospede(listaHospedes: MutableList<String>) {
    print("Qual o valor padrão da diária?")
    var contag = 0
    var meia = 0
    var gratis = 0
    var diaria = 0
    var daily= readln().toDouble()
    while (daily != 100.0 ){
        print( "Valor inválido, $nome\n\n")
        print("Qual o valor padrão da diária?")
        daily = readln().toDouble()
    }

    print("Qual o nome do Hóspede? ")
    var name = readln().uppercase()
    listaHospedes.add(name)
    while (name != "PARE") {
        print("Qual a idade do Hóspede? ")
        var idade = readln().toInt()
        if (idade >= 60) {
            println(" $name cadastrada(o) com sucesso.\n $name paga meia ")
            diaria = diaria + 50
            meia = meia + 1
            contag = contag + 1
        } else if (idade <= 6) {
            println(" $name cadastrada(o) com sucesso.\n $name possui gratuidade")
            gratis = gratis + 1
            contag = contag + 1
        } else {
            println(" $name cadastrada(o) com sucesso.")
            diaria = diaria + 100
            contag = contag + 1
        }

        print("Qual o nome do Hóspede? ")
        name = readln().uppercase()
        listaHospedes.add(name)

        if(name == "PARE"){
            listaHospedes.remove(name)
        }

    }

    println("Lista de Hóspedes atuais: " + listaHospedes)
    println("\n$nome, o valor total das hospedagens é: R$ $diaria; $gratis gratuidade(s); $meia meia(s)\"")
    cadastrarHospedes()
}

fun pesquisarHospede(listaHospedes: MutableList<String>) {
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome do Hóspede:")
    val nomeHospede = readln()

    if (listaHospedes.any { it.contains(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s):")
        listaHospedes.filter { it.contains(nomeHospede, ignoreCase = true) }
            .forEach { println(it) }
        cadastrarHospedes()
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")
        cadastrarQuartos()
    }
}

fun sairCadastroDeHospedes() {
    println("Você deseja sair? S/N")
    val escolha = readln()

    when (escolha.uppercase()) {
        "S" -> {
            println("Hasta la vista, Baby.\n")
            inicio()
        }
        "N" -> {
            println("Ok, voltando ao início.")
            cadastrarHospedes()
        }
        else -> {
            println("Desculpe, mas não compreendi.")
            sairCadastroDeHospedes()
        }
    }
}

fun erroCadastroDeHospedes() {
    println("Por favor, informe um número entre 1 e 3.")
}

fun posto (){

    print("\nQual o valor do álcool no posto Wayne Oil? ")
    val alcoolWayne = readln().toDoubleOrNull() ?: return
    print("\nQual o valor da gasolina no posto Wayne Oil? ")
    val gasolinaWayne = readln().toDoubleOrNull() ?: return
    print("\nQual o valor do álcool no posto Stark Petrol? ")
    val alcoolStark = readln().toDoubleOrNull() ?: return
    print("\nQual o valor da gasolina no posto Stark Petrol? ")
    val gasolinaStark = readln().toDoubleOrNull() ?: return

    var litros = 42
    var alcoolw = alcoolWayne * litros
    var gasosaw = gasolinaWayne * litros
    var alcools = alcoolStark * litros
    var gasosas = gasolinaStark * litros

    //comparação de alcool e gasolina
    var baratoWayne = if(alcoolw < gasosaw * 0.7){
        "Alcool"
    }else{
        "Gasolina"
    }
    var baratoStark = if (alcools < gasosas * 0.7){
        "Alcool"
    }else{
        "Gasolina"
    }

    val resultadoWayne = if (baratoWayne == "álcool") {
        "\né mais barato abastecer com álcool no posto Wayne Oil."
    } else {
        "\né mais barato abastecer com gasolina no posto Wayne Oil."
    }

    val resultadoStark = if (baratoStark == "álcool") {
        "\né mais barato abastecer com álcool no posto Wayne Oil."
    } else {
        "\né mais barato abastecer com gasolina no posto Wayne Oil."
    }

    //Comparação de qual posto esta com o custo de combustivel menor
    val menorCusto = if (alcools < gasosas && alcoolw < gasosaw ) {
        "Posto Wayne Oil."
    } else if (alcools > gasosas && alcoolw > gasosaw) {
        "Posto Stark Petrol."
    } else {
        "\nOs custos são equivalentes."
    }

    println("\nNo posto Wayne Oil, $resultadoWayne")
    println("\nNo posto Stark Petrol, $resultadoStark")
    println("\nO menor custo de abastecimento é no: $menorCusto")

    inicio()
}

fun eventos (){
    var horario = 0
    var empresa: String = ""
    var garcom = 0
    var auditorio = ""

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
            auditorio = "Auditório Laranja"
        }else{
            var cadeira = convidados - 150
            println("")
            println(" Use o auditório Laranja (inclua mais $cadeira cadeiras)\n ")
            println(" Agora vamos ver a agenda do evento. ")
            auditorio = "Auditório Laranja"
        }
    }else if (convidados > 220){
        println(" Use o auditório Colorado \n")
        println(" Agora vamos ver a agenda do evento. ")
        auditorio = "Auditório Colorado"

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
    var horas = duracao + horario
    var conv = convidados / 12
    var func = duracao / 2

    var calculo_garcon = conv + func
    println( " São necessários $calculo_garcon garçons. " )
    var valor_garcom =  calculo_garcon * 10.5
    println(" Custo: R$ $valor_garcom ")

    println("\n Agora vamos calcular o custo do buffet do hotel para o evento.\n " )

    var cafe = convidados * 0.2
    var agua = convidados * 0.5
    var salgado = convidados * 7

    var cal_cafe = cafe * 0.8
    var cal_agua = agua * 0.4
    var cal_salgado = salgado / 100 * 34

    var buffet = cal_salgado + cal_agua + cal_cafe
    var total = buffet + valor_garcom


    println("Evento no $auditorio.\n" +
            "Nome da Empresa: $empresa.\n" +
            "Data: $dia, $horario h às $horas h.\n" +
            "Duração do evento: $duracao H.\n" +
            "Quantidade de garçons: $calculo_garcon.\n" +
            "Quantidade de Convidados: $convidados\n" +
            "\n" +
            "Custo do garçons: R$ $valor_garcom\n" +
            "Custo do Buffet: R$ $buffet\n" +
            "\n" +
            "Valor total do Evento: R$ $total\n\n")

    print("Gostaria de efetuar a reserva? S/N")
    var confirma = readln().uppercase()
    if (confirma == "S") {
        println( " $nome, reserva efetuada com sucesso. ")
        listaEventos.add(" Auditório reservado para $empresa . $dia às $horario hs.")
        println(listaEventos)
        println("")
        println("")
    } else if ( confirma == "N") {
        println("Quem sabe em uma proxima!")
        inicio()
    }
    inicio()
}

fun ar() {
    println(" MANUTENÇÃO DE AR-CONDICIONADOS ")

    println("Qual o nome da sua empresa?")
    val nomeEmpresa = readln().uppercase()

    println("Qual o valor por aparelho?")
    var valorAparelhos = readln().toDouble()

    println("Qual a quantidade de aparelhos?")
    var quantAparelhos = readln().toInt()

    println("Qual a porcentagem de desconto?")
    var porcen = readln().toDouble()

    println("Qual o número mínimo de aparelhos para conseguir o desconto?")
    var minimo= readln().toInt()

    var valorTotal = quantAparelhos * valorAparelhos
    var valorDesc = valorTotal * (porcen / 100)
    var valorComDesc = valorTotal - valorDesc

    if (quantAparelhos >= minimo) {
        println("O serviço de $nomeEmpresa custará R$ $valorComDesc reais")
    } else {
        println("O serviço de $nomeEmpresa custará R$ $valorTotal reais")
    }

    println("Deseja informar novos dados $nome ? S/N")

    var escolha = readln().uppercase()

    when (escolha) {
        "S" -> ar()
        "N" -> inicio()
        else -> {
            println("Desculpe, mas não compreendi.")
            return
        }

    }
}

fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sairDoHotel() {
    println("Você deseja sair? S/N")
    var confirma = readln().uppercase()
    if (confirma == "S") {
        println( "Muito obrigado e até logo, $nome")
        exitProcess(0)
    } else if ( confirma == "N") {
        inicio()
    }
}
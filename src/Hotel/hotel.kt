package Hotel

import kotlin.system.exitProcess

val senha = 2678
var nome = ""
var login = mutableListOf<String>()
var quartos = mutableListOf(
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    "livre",
    )


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
    main()
}

fun inicio() {

    println("Bem vindo ao Ibis, $nome. É um imenso prazer ter você por aqui!")

    println("Escolha uma opção de cadastro:\n 1. Quartos\n 2. Hospede\n 3. Abastecimento\n 4. Sair \n 5. Login")

    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> AbastecimentoDeAutomoveis()
        4 -> sairDoHotel()
        5 -> login()
        else -> erro()
    }
}

fun cadastrarQuartos() {

    println()


    println("Os quartos disponiveis são:\n")
    var m = 1
    for (i in quartos){
        println("Quarto $m, está $i")
        m++
    }
    println("Qual quarto você deseja reservar ?")
    var reserva = readln().toInt()
    if (reserva in 1..20){
        if (quartos[reserva - 1] == "livre"){
            quartos[reserva - 1] = "ocupado"
            println("Reserva do quarto $reserva feita com sucesso!")
            println("")
            inicio()
        }else{
            println("Quarto já está ocupado")
           cadastrarQuartos()
        }
    }
    println("")
    inicio()

}

fun AbastecimentoDeAutomoveis() {

}

fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sairDoHotel() {
    println("Você deseja sair? S/N")
    var confirma = readln().uppercase()
    if (confirma == "S") {
        println( "Muito obrigado e até logo, .")
    } else if ( confirma == "N") {
        inicio()
    } else{
        inicio()
    }
}


fun cadastrarHospedes() {
    val listaHospedes = mutableListOf(
        "Carlos Villagran", "Maria Antonieta de las Nieves", "Roberto Gómez Bolaños", "Florinda Meza", "Ramón Valdés", "Rubén Aguirre", "Angelines Fernández", "Edgar Vivar", "Horácio Gómez Bolaños", "Raúl Padilla"
    )

    while (true) {
        println("""Cadastro de Hóspedes
            Selecione uma opção:
            1. Cadastrar
            2. Pesquisar
            3. Sair""")

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> cadastrarHospede(listaHospedes)
            2 -> pesquisarHospede(listaHospedes)
            3 -> sairCadastroDeHospedes()
            else -> erroCadastroDeHospedes()
        }
    }
}

fun cadastrarHospede(listaHospedes: MutableList<String>) {
    println("Cadastro de Hóspedes.\nPor favor, informe o nome da Hóspede:")
    val novoHospede = readln()
    listaHospedes.add(novoHospede)

    println("$novoHospede cadastrado com sucesso!")
    println("Lista de Hóspedes atuais " + listaHospedes)

}

fun pesquisarHospede(listaHospedes: MutableList<String>) {
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome do Hóspede:")
    val nomeHospede = readln()

    if (listaHospedes.any { it.contains(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s):")
        listaHospedes.filter { it.contains(nomeHospede, ignoreCase = true) }
            .forEach { println(it) }
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")
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
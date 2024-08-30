package ex_codar_4

//Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida,
// Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.

fun main() {

    var list = mutableListOf<String>()
    val parada = "pare"
    print("Iforme o nome do aluno: ")

    var nome: String = readln()
    list.add(nome.toString())

    var alunos = 0

    while(parada != nome){
    print("Iforme o nome do aluno: ")
        nome = readln().toString()
        alunos++
        list.add(nome.toString())
        if (nome == "pare"){
            alunos--
            list.remove("pare")
        }
    }
    println("Nome dos alunos cadastrados: ${list}")
    println("Quantidade cadastrada: $alunos")
}
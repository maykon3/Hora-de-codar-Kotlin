package ex_codar_4

var list = mutableListOf<String>("Banana", "Maça", "Manga", "Uva")
var ricoy = mutableListOf<String>("Banana", "Maça", "Manga", "Uva")

fun main() {

    println(list)

    print("Informe o nome de uma fruta: ")
    var fruta: String = readln()

    println("Deseja incluir a lista de compras ou excluir? ")
    var condicao: String = readln()

    if (condicao == "excluir") {
        list.remove(fruta.toString())
        println("$list")
    } else if (condicao == "incluir") {
        list.add(fruta.toString())
        println("$list")
    }
    println(list)
    print("Deseja adicionar mais frutas? ")
    var retorno: String = readln()

    while (retorno == "sim") {
        print("Informe o nome de uma fruta: ")
        var fruta: String = readln()

        println("Deseja incluir a lista de compras ou excluir? ")
        var condicao: String = readln()

        if (condicao == "excluir") {
            list.remove(fruta.toString())
            println("$list")
        } else if (condicao == "incluir") {
            list.add(fruta.toString())
            println("$list")
        }
        print("Deseja continuar ?")
        retorno = readln().toString()
    }
    if (retorno == "nao") {
        println("Lista encerrada \n sua lista esta composta por: $list")
        mercado()
    }

}


fun mercado() {
    println("Vamos as compras!")
    println("Informe o nome de uma fruta: ")
    var compra: String = readln()
    if (ricoy.contains(compra)) {
        ricoy.remove(compra.toString())
    } else {
        println("Fruta indisponivel no nosso mercado")
        println("Temos essas opcoes de fruta: $ricoy")
    }
    print("Deseja comprar mais frutas? ")
    var go = readln().toString()
    while (go == "sim") {
        print("Informe o nome de uma fruta: ")
        compra = readln().toString()
        if (ricoy.contains(compra)) {
            ricoy.remove(compra.toString())
        } else {
            println("Fruta indisponivel no nosso mercado")
            println("Temos essas opcoes de fruta: $ricoy")
        }
        if (ricoy.isEmpty()) {
            println("Lista de compras finalizada")
            pare()
            break
        } else {
            println("Continuar comprando ?")
            go = readln().toString()
        }
    }
    if (go == "nao") {
        pare()
    }
}

fun pare() {
    println("Obrigado, volte sempre!")
}

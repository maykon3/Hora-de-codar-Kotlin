package ex_codar_4

var list = mutableListOf<String>("BANANA", "MAÇA", "MANGA", "UVA")
var ricoy = mutableListOf<String>("BANANA", "MAÇA", "MANGA", "UVA")

fun main() {

    println(list)

    print("Informe o nome de uma fruta: ")
    var fruta: String = readln().uppercase()

    println("Deseja incluir a lista de compras ou excluir? ")
    var condicao: String = readln()

    if (condicao == "excluir") {
        list.remove(fruta.toString())
    } else if (condicao == "incluir") {
        list.add(fruta.toString())
    }
    println(list)
    print("Deseja adicionar ou riscar alguma frutas? (S/N)")
    var retorno: String = readln().uppercase()

    while (retorno == "S") {
        print("Informe o nome de uma fruta: ")
        fruta = readln().uppercase()

        println("Deseja incluir a lista de compras ou excluir? ")
        var condicao: String = readln()

        if (condicao == "excluir") {
            list.remove(fruta.toString())
            println("$list")
        } else if (condicao == "incluir") {
            list.add(fruta.toString())
            println("$list")
        }
        print("Deseja adicionar mais frutas? (S/N)")
        retorno = readln().uppercase()
    }
    if (retorno == "N") {
        println("Lista encerrada \n sua lista esta composta por: $list")
        println("")
        mercado()
    }

}


fun mercado() {
    println("Vamos as compras!")
    println("Informe o nome de uma fruta: ")
    var compra: String = readln().uppercase()
    if (ricoy.contains(compra)) {
        ricoy.remove(compra.toString())
    } else {
        println("Fruta indisponivel no nosso mercado")
        println("Temos essas opcoes de fruta: $ricoy")
    }
    print("Deseja comprar mais frutas? (S/N) ")
    var go = readln().uppercase()
    while (go == "S") {
        print("Informe o nome de uma fruta: ")
        compra = readln().uppercase()
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
            println("Continuar comprando ? (S/N)")
            go = readln().toString().uppercase()
        }
    }
    if (go == "N") {
        pare()
    }
}

fun pare() {
    println("Obrigado, volte sempre!")
}

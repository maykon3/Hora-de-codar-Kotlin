package ex_codar_5

import java.util.*
import kotlin.system.exitProcess

var saldo = 300.0 // Float
var extrato = mutableListOf<String>()
var senha = 3589
var nome: String = ""

fun main() {
    print("Informe o seu nome: ")
    nome = readln().toString()
    println("")
    println("Olá, $nome é um prazer ter você por aqui! ")
    inicio()
}

fun inicio() {
    println("Escolha uma opção:")
    println("1 - Ver saldo")
    println("2 - Ver extrato")
    println("3 - Fazer saque")
    println("4 - Fazer depósito")
    println("5 - Fazer Tranferencia")
    println("6 - Sair")

    val escolha = readln()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> extratoBancario()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> transf()
        6 -> sair()
        else -> erro()
    }
}


fun extratoBancario() {

    print("Senha: ")
    var pass = readln().toInt()
    if (pass == senha) {
        println("O extrato desta conta é:$extrato")
        inicio()
    }else {
        println("Senha incorreta")
        inicio()
    }

}

fun verSaldo() {
    println("Para visualizar o saldo informe sua senha ")
    println("")
    print("senha:")
    var pass = readln().toInt()
    if (pass == senha) {
        println("Seu saldo atual é: $saldo")
        inicio()
    }else {
        println("Senha incorreta")
        inicio()

    }
}

fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    var deposito = readln()?.toFloatOrNull()
    // Usando readln e Elvis operator -> Operador de coalescência nula
    // val deposito = readln().toFloatOrNull() ?: 0.0
    if (deposito == null || deposito <= 0) {
        println("Operação não autorizada")
        println("Por favor, informe um valor acima de 0.")
        fazerDeposito()
    }
    print("Senha: ")
    var pass = readln().toInt()
    if (pass == senha) {
        saldo  = saldo + deposito!!
        extrato.add("deposito: +$deposito")
        verSaldo()
        inicio()
    }else{
        println("Senha incorreta")
        inicio()
        }
    }


fun transf() {
    print("Qual o valor para a tranferência: ")
    var tranferencia = readLine()?.toFloatOrNull()

    if (tranferencia == null || tranferencia <= 0) {
        println("Operação não autorizada")
        println("Por favor, informe um valor acima de 0.")
        transf()
    }
    print("Senha: ")
    var pass = readln().toInt()
    if (pass == senha){
        saldo -= tranferencia!!
        if (saldo < 0){
            println("Operação não autorizada")
            println("Valor a cima do seu saldo ")
            saldo = saldo + tranferencia
            verSaldo()
        } else {
            print("Informe o numero da conta: ")
            var caixa = readln().toDouble()
            print("Informe o numero da agencia: ")
            var agencia = readln().toDouble()
            extrato.add("saque: -$tranferencia")
            println("Tanferencia efetuada!")
            println("Conta: $caixa\n Agencia: $agencia")
            verSaldo()
        }
    }else{
        println("Senha incorreta")
        inicio()
    }
}

fun fazerSaque() {
    print("Qual o valor para saque? ")
    val saque = readLine()?.toFloatOrNull()

    if (saque == null || saque <= 0) {
        println("Operação não autorizada")
        println("Por favor, informe um número válido.")
        fazerSaque()
    }
    print("Senha: ")
    var pass = readln().toInt()
    if (pass == senha){
        saldo -= saque!!
        if (saldo < 0) {
            println("Operação não autorizada")
            println("Valor a cima do seu saldo ")
            saldo = saldo + saque
            verSaldo()
        } else {
            extrato.add("saque: -$saque")
            verSaldo()
        }

    }else{
        println("Senha incorreta")
        inicio()
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}

fun sair() {
    print("Você deseja sair? (S/N)")
    // Usando readln e Elvis operator -> Operador de coalescência nula
    val confirma = readln().uppercase()
    // Locale -> Localização do usuário para converter para maiúsculo
    //val confirma = readLine()?.uppercase(Locale.getDefault())
    if (confirma == "S"){
        println("$nome, foi um prazer ter você por aqui!. ")
    }
    when (confirma) {
        "S" -> exitProcess(0) //Hasta la vista, baby
        "N" -> inicio() // Volta para o início
        else -> sair()
    }
}
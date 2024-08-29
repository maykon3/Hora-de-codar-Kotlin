package ex_codar_3
//Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
// Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?"
// e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente,
// caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

fun main() {
    var list = mutableListOf<Double>()
    var numero = 0.0
    var aprov = 0


    for(n in 1..2){
        print("Informe a nota: ")
        numero = readln().toDouble()
        numero = numero + numero
    }
    var soma = numero / 2

    if ( soma >= 9.5){
        println("Você foi arpovado!")
        aprov++
    }else{
        println("tente novamente")
    }

    println("Calcular a média de outro aluno Sim/Não?")
    var media = readln()
    while(media == "sim" || media == "Sim" || media == "s" || media == "S"){
        for(n in 1..2){
            print("Informe a nota: ")
            numero = readln().toDouble()
            numero = numero + numero
        }
        var soma = numero / 2
        if ( soma >= 9.5){
            println("Você foi arpovado!")
            aprov++
        }else{
            println("tente novamente")
        }
        println("Calcular a média de outro aluno Sim/Não?")
        media = readln()
    }
    if (media == "nao" || media == "Nao" || media == "N" || media == "n"){
        println("Programa encerrado")
    }
    println("Aprovados: $aprov")

}

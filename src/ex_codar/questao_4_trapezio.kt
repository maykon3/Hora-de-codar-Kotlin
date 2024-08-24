package ex_codar

fun main() {
    print("Digite o valor da base maior: ")
    var baseMaior: Double = readln().toDouble()

    print("Digite o valor da diagonal menor:")
    var baseMenor: Double = readln().toDouble()

    print("Digite o valor da altura: ")
    var altura : Double = readln().toDouble()

    println("resultado do losangulo e: " + ((baseMaior + baseMenor) * altura) / 2 )
}
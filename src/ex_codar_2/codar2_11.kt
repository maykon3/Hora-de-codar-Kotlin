package ex_codar_2

//Uma micro calculadora
//Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a
// serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
//O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.

fun main() {
    var result = 0.0

    print("Informe o primeiro valor: ")
    var num: Double =  readln().toDouble()

    print("Informe o segundo valor: ")
    var num2: Double = readln().toDouble()

    println("Informe a operacao desejada:")
    println (" 1. Adição(+)\n 2. Subtração(-)\n 3. Divisão(/)\n 4. Multiplicação(*) ")
    var opera: Int = readln().toInt()

    if ( opera == 1 ){
        result = num + num2
        print("O resultado da operação é: $num + $num2 = $result ")
    }else if ( opera == 2 ){
        result = num - num2
        print("O resultado da operação é: $num - $num2 = $result ")
    }else if( opera == 3 ){
        result = num / num2
        print("O resultado da operação é: $num / $num2 = $result ")
    }else if ( opera == 4 ){
        result = num * num2
        print("O resultado da operação é: $num * $num2 = $result ")
    }

}
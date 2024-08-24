package ex_codar_2

// Faça um programa que receba quatro valores informados pelo usuário,
// mas informe somente o primeiro, o último e o maior de todos eles
fun main() {
        print("Digite um numero: ")
        var num1: Int = readln().toInt()
        print("Digite outro numero: ")
        var num2: Int = readln().toInt()
        print("Digite mais um numero: ")
        var num3: Int = readln().toInt()
        print("Digite mais um numero: ")
        var num4:Int = readln().toInt()
        var maior: Int = 0

        if(num1 > num2 && num1 > num3 && num1 > num4){
            maior += num1
        }else if(num2 > num1 && num2 > num3 && num2 > num4){
            maior += num2
        }else if(num3 > num2 && num3 > num1 && num3 > num4){
            maior += num3
        }else if (num4 > num2 && num4 > num3 && num4 > num1){
            maior += num4
        }
        println("Assim como proposto no enunciado, o primeiro valor $num1, o ultimo $num4 e o maior deles $maior")
    }

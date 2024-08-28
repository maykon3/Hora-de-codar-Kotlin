package ex_codar_3

import javax.swing.Timer
import kotlin.concurrent.timer

//Crie uma bomba relógio (usando somente código - para deixar claro!)
// cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".
fun main() {
    var numero = 30

    println("Contagem iniciada \n 30")
    for(n in 1..30){
        numero = numero - 1
        println(" $numero")
    }
    println("EXPLOSÃO")
}
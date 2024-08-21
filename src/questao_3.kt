//Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
// Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

fun main() {
    print("Digite o seu nome: ")
    var nomeDoUsuario = readln()
    print("Qual sua idade: ")
    var Int = readln()
    println("Olá, " + nomeDoUsuario + ", sua idade é " + Int)
}
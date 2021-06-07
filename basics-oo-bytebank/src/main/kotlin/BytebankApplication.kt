import domain.Conta

fun main() {
    println("Herou Wordi")
    printAccount()
}

fun printAccount() {

    val contas: ArrayList<Conta> = ArrayList()

    for( i in 5 downTo 1) {

        val titular = "Miguel Àngel Ramirez $i"
        val numeroConta = 1000 + i

        val conta =  Conta(titular, numero = numeroConta)
        conta.depositar(i * 50.0)

        println(conta)
        testaCondicoes(conta)
        println()
        contas.add(conta)
    }

    contas[0].transferir(contas[4], 30.0)

}

fun testaCondicoes(conta : Conta){
    when {
        conta.saldo > 0.0 -> println("Conta positiva")
        conta.saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}
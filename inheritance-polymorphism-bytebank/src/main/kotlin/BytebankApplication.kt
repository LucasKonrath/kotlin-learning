import domain.*

fun main() {
    println("Herou Wordi")
    printAccount()
}

fun printAccount() {

    val contas: ArrayList<ContaCorrente> = ArrayList()

    for (i in 5 downTo 1) {

        val titular = "Miguel Àngel Ramirez $i"
        val numeroConta = 1000 + i

        val conta = ContaCorrente(titular, numero = numeroConta)
        conta.depositar(i * 50.0)

        println(conta)
        testaCondicoes(conta)
        println()
        contas.add(conta)
    }

    contas[0].transferir(contas[4], 30.0)

    val contaSalario = ContaSalario(titular = "Lucas", numero = 7776666)

    // compilation failure
    // contaSalario.transferir(contas[4], 30.0)

    val cliente = ClienteExterno("berg", "111111111","1234")

    val alex = Analista(nome = "alex", salario = 1000.0, cpf = "2381931933")
    val lucas = Gerente(nome = "lucas", cpf = "02812791829", salario = 15000.00, senha = "teste")
    val tesser = Diretor(nome = "lucas", cpf = "02812791829", salario = 15000.00, senha = "teste", plr = 750000.00)
    val vinicius = Analista(nome = "maria", cpf = "777-666", salario = 13000.00)
    println("nome ${alex.nome} cpf ${alex.cpf} salario ${alex.salario} bonificacao ${alex.bonificacao}")
    println("nome ${lucas.nome} cpf ${lucas.cpf} salario ${lucas.salario} bonificacao ${lucas.bonificacao} autentica ${lucas.autentica("teste")}")
    println("nome ${tesser.nome} cpf ${tesser.cpf}  autentica ${cliente.autentica("teste")}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(alex)
    calculadoraBonificacao.registra(lucas)
    calculadoraBonificacao.registra(tesser)
    calculadoraBonificacao.registra(vinicius)
    println("total de bonificação ${calculadoraBonificacao.total}")

    val contaCorrente = ContaCorrente("berg", numero = 1000)

    val contaPoupanca = ContaPoupanca("do ceu", numero = 1001)

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("saldo corrente: ${contaCorrente.saldo} saldo poupança  ${contaPoupanca.saldo}")

    contaCorrente.transferir(contaPoupanca, 100.0)

    println("saldo corrente ${contaCorrente.saldo} saldo popuança ${contaPoupanca.saldo}")

    SistemaInterno().entra(tesser, "teste")
}

fun testaCondicoes(conta: Conta) {
    when {
        conta.saldo > 0.0 -> println("Conta positiva")
        conta.saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta negativa")
    }
}
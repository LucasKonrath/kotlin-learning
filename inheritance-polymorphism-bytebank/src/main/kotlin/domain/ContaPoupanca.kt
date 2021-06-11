package domain

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero), ContaTransferivel {

    override fun sacar(saldo: Double) {
            this.saldo -= saldo
    }

    override fun transferir(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            this.sacar(valor)
            contaDestino.depositar(valor)
            return true
        }

        return false
    }
}
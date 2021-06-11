package domain

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(titular = titular, numero = numero), ContaTransferivel {

    override fun transferir(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            this.sacar(valor)
            contaDestino.depositar(valor)
            return true
        }

        return false
    }

    override fun sacar(saldo: Double) {
        this.saldo -= (saldo + 0.1)
    }
}
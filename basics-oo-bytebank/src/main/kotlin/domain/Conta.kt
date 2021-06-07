package domain

class Conta(
    var titular: String,
    var numero: Int,
) {
    var saldo = 0.0
        private set

    fun depositar(saldo: Double) {
        this.saldo += saldo
    }

    fun sacar(saldo: Double) {
        this.saldo -= saldo
    }

    fun transferir(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            this.sacar(valor)
            contaDestino.depositar(valor)
            return true
        }

        return false
    }
}
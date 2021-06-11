package domain

abstract class Conta(
    var titular: String,
    var numero: Int,
) {
    var saldo = 0.0
        protected set

    fun depositar(saldo: Double) {
        this.saldo += saldo
    }

    abstract fun sacar(saldo: Double)

}
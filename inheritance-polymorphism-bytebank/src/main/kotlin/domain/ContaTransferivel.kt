package domain

interface ContaTransferivel {
    fun transferir(contaDestino: Conta, valor: Double) : Boolean
}
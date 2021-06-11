package domain

interface Autenticavel {

    val senha: String

    fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}
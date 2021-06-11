package domain

class ClienteExterno(val nome: String, val cpf: String, override val senha: String): Autenticavel {
    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}
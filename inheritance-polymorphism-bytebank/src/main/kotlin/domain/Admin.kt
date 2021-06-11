package domain

abstract class Admin(
    nome: String,
    cpf: String,
    salario: Double
)  : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}
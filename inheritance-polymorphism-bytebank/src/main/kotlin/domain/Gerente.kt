package domain

class Gerente(
    override val senha: String,
    cpf: String,
    nome: String,
    salario: Double
) : Admin(nome, cpf, salario), Autenticavel {

    override val bonificacao: Double get() = salario

}
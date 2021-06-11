package domain

class Diretor(
    override val senha: String,
    val plr: Double,
    cpf: String,
    nome: String,
    salario: Double,
) : Admin(nome, cpf, salario), Autenticavel {

    override val bonificacao: Double get() =  plr

}
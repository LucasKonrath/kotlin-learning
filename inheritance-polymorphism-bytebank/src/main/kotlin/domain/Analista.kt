package domain

class Analista(
    cpf: String,
    nome: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario + (salario * 0.10)

}
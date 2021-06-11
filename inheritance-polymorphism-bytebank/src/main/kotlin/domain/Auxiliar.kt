package domain

class Auxiliar(
    cpf: String,
    nome: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() = salario * 0.05

}
package domain

class SistemaInterno {

    fun entra(funcionario: Admin, senha: String){
        if(funcionario.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}
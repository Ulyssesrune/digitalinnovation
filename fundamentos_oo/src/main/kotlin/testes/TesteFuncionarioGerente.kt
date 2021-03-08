package testes

import one.digitalinnovation.digionebank.Gerente


fun main() {
    val Baubu = Gerente("Fidalgo2", "121.121.121.12", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(Baubu)

    TesteAutenticacao().autentica(Baubu)

}


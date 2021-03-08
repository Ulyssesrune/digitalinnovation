package testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val fidalgo = Analista("Fidalgo", "121.121.121.12", 5000.0)
    ImprimeRelatorioFuncionario.imprime(fidalgo)

}
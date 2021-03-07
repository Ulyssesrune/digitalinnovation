package teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val voidBank = Banco(nome = "voidBank", numero = 12)

    println(voidBank.nome)
    println(voidBank.numero)

    val banco2 = voidBank.copy(nome = "Banco2")

    println(banco2.info())
}
package one.digitalinnovation.digionebank

//outer class
class Pessoa{
    var nome: String = "Ulysses"
    var cpf: String = "222.222.222.00"
    //maintaining document info
    private set

    //secondary constructor
    constructor()

    fun PessoaInfo() = "$nome e $cpf"
}

fun main() {
    val ulysses = Pessoa()

    println(ulysses.PessoaInfo())








}


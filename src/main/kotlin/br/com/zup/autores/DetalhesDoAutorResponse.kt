package br.com.zup.autores

class DetalhesDoAutorResponse ( autor: Autor ) {
    var nome: String = ""
    var email: String = ""
    var descricao: String = ""

    init {
        nome = autor.nome.toString()
        email = autor.email.toString()
        descricao = autor.descricao.toString()
    }
}


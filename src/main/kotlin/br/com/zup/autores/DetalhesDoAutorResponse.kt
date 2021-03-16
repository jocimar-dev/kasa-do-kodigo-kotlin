package br.com.zup.autores

import io.netty.util.concurrent.Promise

class DetalhesDoAutorResponse(autor: Autor) {
    val nome = autor.nome
    val email = autor.email
    val descricao = autor.descricao
    }

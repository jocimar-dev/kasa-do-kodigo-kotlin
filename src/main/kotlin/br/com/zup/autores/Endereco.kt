package br.com.zup.autores

import javax.persistence.Embeddable

@Embeddable
class Endereco(enderecoResponse: EnderecoResponse,
               var numero: String
             ) {
    var rua: String? = ""
    var cidade: String? = ""
    var estado: String? = ""
    var cep: String? = ""

    init {
        cep = enderecoResponse?.cep
        rua = enderecoResponse?.logradouro
        cidade = enderecoResponse?.localidade
        estado = enderecoResponse?.uf

    }
}

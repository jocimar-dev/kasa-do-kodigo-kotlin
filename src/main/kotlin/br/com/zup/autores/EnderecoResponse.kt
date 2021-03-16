package br.com.zup.autores

data class EnderecoResponse(
    var cep: String?,
    var logradouro: String?,
    var complemento: String?,
    var bairro: String?,
    var localidade: String?,
    var uf: String?
)

package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:8081/cep/busca")
interface EnderecoClient {

    @Get
    @Consumes(MediaType.APPLICATION_XML)
    fun consulta(@QueryValue cep: String) : HttpResponse<EnderecoResponse>

}

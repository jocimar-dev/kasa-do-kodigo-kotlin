package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/autores")
class BuscaDetalhesAutoresController(val autorRepository: AutorRepository) {

    @Get
    fun lita(): HttpResponse<List<DetalhesDoAutorResponse>> {
        val autores = autorRepository.findAll()

        val resposta = autores.map { autor -> DetalhesDoAutorResponse(autor) }

            return HttpResponse.ok(resposta)
    }
}
package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.uri.UriBuilder

@Controller("/autores")
class CadastraAutorController(val autorRepository: AutorRepository,
                              val enderecoClient: EnderecoClient) {

    @Post
    fun cadastra(@Body request: NovoAutorRequest) : HttpResponse<Any> {
        println("Requisição => ${request}")
        val enderecoResponse = enderecoClient.consulta(request.cep)

        val autor = request.paraAutor(enderecoResponse.body()!!)
        autorRepository.save(autor)

        println("Autor => ${autor.nome}")

        val uri = UriBuilder.of("/autores/{id}")
                            .expand(mutableMapOf(Pair("id", autor.id)))

        return HttpResponse.created(uri)
    }

}
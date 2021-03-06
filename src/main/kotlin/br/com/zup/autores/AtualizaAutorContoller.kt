package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Put

@Controller("/autores/{id}")
class AtualizaAutorContoller(val autorRepository: AutorRepository) {

    @Put
    fun possivelAutor(@PathVariable id: Long, descricao: String): HttpResponse<Any> {
        val possivelAutor = autorRepository.findById(id)

        if (possivelAutor.isEmpty) {
            return HttpResponse.notFound()
        }

        val autor = possivelAutor.get()

        autor.descricao = descricao

        return HttpResponse.ok(DetalhesDoAutorResponse(autor))

    }
}
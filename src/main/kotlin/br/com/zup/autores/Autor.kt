package br.com.zup.autores

import java.time.LocalDateTime
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Embedded
import javax.persistence.Entity

@Entity
class Autor(
    var nome: String?,
    var email: String?,
    var descricao: String?,
    @field:Embedded val endereco: Endereco) {

    @Id
    @GeneratedValue
    var id : Long? = null

    var criadoEm: LocalDateTime = LocalDateTime.now()

}

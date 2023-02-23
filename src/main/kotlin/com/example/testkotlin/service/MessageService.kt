package com.example.testkotlin.service

import com.example.testkotlin.model.Message
import com.example.testkotlin.repository.MessageRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.optionals.toList

@Service
class MessageService(val db: MessageRepository) {
//class MessageService(val db: JdbcTemplate) {

    fun findMessage(): List<Message> = db.findAll().toList()

    fun findMessageById(id: Int): List<Message> = db.findById(id).toList()

    fun save(message: Message) {
        db.save(message)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
            if (isPresent) listOf(get()) else emptyList()


//    fun findMessage(): List<Message> = db.query("select * from messages") { responce, _ ->
//        Message (responce.getString("id"), responce.getString("text"))
//    }
//
//    fun findMessageById(id: String): List<Message> = db.query("select * from messages where id = ?", id) { response, _ ->
//        Message (response.getString("id"), response.getString("text"))
//
//    }
//
//    fun save(message: Message){
//        val id = message.id ?: UUID.randomUUID().toString()
//        db.update("insert into messages values ( ? , ? )",
//                    id, message.text)
//    }

}
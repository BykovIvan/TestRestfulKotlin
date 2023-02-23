package com.example.testkotlin.controller

import com.example.testkotlin.model.Message
import com.example.testkotlin.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController (val service: MessageService) {
    @GetMapping("/")
    fun index(): List<Message> = service.findMessage()

    @GetMapping("/{id}")
    fun index(@PathVariable id: Int): List<Message> = service.findMessageById(id)

    @PostMapping("/")
    fun post(@RequestBody message: Message){
        service.save(message)
    }
}
package com.example.testkotlin.repository

import com.example.testkotlin.model.Message
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, Int> {
}
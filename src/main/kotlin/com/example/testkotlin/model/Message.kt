package com.example.testkotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("messages")
data class Message(@Id val id: Int, val text: String)

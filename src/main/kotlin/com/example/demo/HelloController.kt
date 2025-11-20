package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    fun hello(): String {
        return "<h1>Hello World!</h1><p>This is a basic Kotlin Spring Boot page.</p>"
    }
}

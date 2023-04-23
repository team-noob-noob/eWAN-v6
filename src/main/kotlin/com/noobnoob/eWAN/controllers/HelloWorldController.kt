package com.noobnoob.eWAN.controllers

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/")
    fun helloWorld(model: Model) = listOf(
        Goat(true, true),
        Goat(true, true),
        Goat(true, true),
    )

    fun helloBwoi(goat: Goat): String {
        return when {
            goat.isGud -> "AIGHT U GUD"
            goat.isYes -> "YES"
            else -> "VER NICE"
        }
    }

}


data class Goat(
    val isGud: Boolean,
    val isYes: Boolean
)
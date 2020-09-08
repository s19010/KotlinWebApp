package com.example.Kotlinwebapp

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("greeting")
class GreetingController {
    @GetMapping("")
    fun index() = "greeting/index"

    @GetMapping("/english")
    fun english() = "greeting/english"

    @GetMapping("/japanese")
    fun japanese() = "greeting/japanese"

    @GetMapping("/french")
    fun french() = "greeting/french"
}
package com.prosvet.mp.kafka.controller

import com.prosvet.mp.kafka.service.Producer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafka")
class KafkaController(
    val producer: Producer
) {
    private val logger: Logger = LoggerFactory.getLogger(KafkaController::class.java)

    @GetMapping("/send")
    fun sendMessage(){
        producer.sendMessage("Hello World!!")
        logger.info("Message was send")
    }
}

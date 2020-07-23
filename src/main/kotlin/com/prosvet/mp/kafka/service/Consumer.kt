package com.prosvet.mp.kafka.service

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class Consumer {
    private val logger = LoggerFactory.getLogger(Consumer::class.java)

    @KafkaListener(topics = ["users"])
    @Throws(IOException::class)
    fun consume(message: String?) {
        logger.info(String.format("#### -> Consumed message -> %s", message))
    }
}

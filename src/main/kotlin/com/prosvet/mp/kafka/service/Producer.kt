package com.prosvet.mp.kafka.service

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class Producer {
    @Autowired
    private val kafkaTemplate: KafkaTemplate<String, String?>? = null
    fun sendMessage(message: String?) {
        logger.info(String.format("#### -> Producing message -> %s", message))
        kafkaTemplate!!.send(TOPIC, message)
    }

    companion object {
        private val logger = LoggerFactory.getLogger(Producer::class.java)
        private const val TOPIC = "users"
    }
}


package com.thanatos.pay

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScans

/**
 * 入口
 */
@ComponentScans
@EnableAutoConfiguration
@SpringBootApplication
class SpringPayApplication


fun main(args: Array<String>) {
    SpringApplication.run(arrayOf(SpringPayApplication::class.java), args)
}


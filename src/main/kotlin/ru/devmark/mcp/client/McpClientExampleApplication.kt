package ru.devmark.mcp.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class McpClientExampleApplication

fun main(args: Array<String>) {
    runApplication<McpClientExampleApplication>(*args)
}

package ru.devmark.mcp.client.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.devmark.mcp.client.dto.MessageDto
import ru.devmark.mcp.client.service.AiService

@RestController
@RequestMapping("/ai")
class AiController(
    private val aiService: AiService,
) {
    @PostMapping("/tools")
    fun processUserMessage(@RequestBody message: MessageDto): MessageDto =
        MessageDto(
            text = aiService.processUserMessage(message.text)
        )
}

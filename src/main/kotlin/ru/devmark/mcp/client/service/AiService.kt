package ru.devmark.mcp.client.service

import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.messages.SystemMessage
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.ai.openai.OpenAiChatOptions
import org.springframework.ai.openai.api.OpenAiApi
import org.springframework.ai.openai.api.ResponseFormat
import org.springframework.stereotype.Service

@Service
class AiService(
    private val chatClient: ChatClient,
) {
    fun processUserMessage(userMessage: String): String {
        val responseFormat = ResponseFormat.builder()
            .type(ResponseFormat.Type.TEXT)
            .build()

        val chatOptions = OpenAiChatOptions.builder() // или другая реализация ToolCallingChatOptions
            .model(OpenAiApi.ChatModel.GPT_4_1_MINI)
            .temperature(0.0)
            .responseFormat(responseFormat)
            .build()

        return chatClient.prompt(Prompt(SystemMessage(SYSTEM_PROMPT), chatOptions))
            .user(userMessage)
            .call()
            .content()
            ?: "Не удалось получить ответ"
    }

    private companion object {
        val SYSTEM_PROMPT = """
            Ты - умный помощник. Всегда отвечай на вопросы максимально коротко, без лишних слов и без ненужных деталей.
        """.trimIndent()
    }
}

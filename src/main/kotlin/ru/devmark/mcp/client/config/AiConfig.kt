package ru.devmark.mcp.client.config

import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor
import org.springframework.ai.tool.ToolCallbackProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AiConfig {
    @Bean
    fun chatClient(
        builder: ChatClient.Builder,
        toolCallbackProvider: ToolCallbackProvider,
    ): ChatClient =
        builder
            .defaultAdvisors(
                SimpleLoggerAdvisor(),
            )
            .defaultToolCallbacks(toolCallbackProvider)
            .build()
}

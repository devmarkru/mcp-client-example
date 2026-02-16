# mcp-client-example

Пример MCP (**model context protocol**) клиента на **Spring AI**. Требует наличия [MCP-сервера](https://github.com/devmarkru/mcp-server-example), запущенного на `localhost:8081`, но это можно переопределить в `application.yml`.

## Переменные окружения

Для запуска приложения требуется определить следующие переменные окружения:

- `OPEN_AI_API_KEY` - ключ для выполнения запросов к Open AI
- `OPEN_AI_BASE_URL` (опционально) - позволяет переопределить эндпоинт LLM, к которому происходит подключение (при использовании другой LLM с совместимым протоколом)

Данный проект содержит `Dockerfile`, поэтому его можно легко развернуть в облачном хостинге.

### Полезные ссылки
* [Spring AI: Model Context Protocol](https://devmark.ru/article/spring-ai-mcp).
* [Пример MCP-сервера](https://github.com/devmarkru/mcp-server-example)
* [dockhost.ru](https://dockhost.ru/?utm_source=devmark&utm_medium=cpa&utm_campaign=devmark&p=z8i9gexg) - облачный хостинг по технологии `Push-to-Deploy`.
* [Новости проекта](https://t.me/+RjrPWNUEwf8wZTMy) и короткие заметки.
* Ещё больше статей по разработке ПО вы можете найти на моём сайте [devmark.ru](https://devmark.ru/).

package com.example.cgnjava244openaiapi.model;

/**
 * {
 *  *             "message": {
 *  *                 "role": "assistant",
 *  *                 "content": "This is a test! How can I assist you further?"
 *  *             }
 *  *         }
 */
public record OpenAiChoices(OpenAiMessage message) {
}

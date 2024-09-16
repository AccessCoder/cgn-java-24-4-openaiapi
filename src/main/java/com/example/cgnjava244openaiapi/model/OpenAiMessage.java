package com.example.cgnjava244openaiapi.model;

/**
 * {
 *  *  *                 "role": "assistant",
 *  *  *                 "content": "This is a test! How can I assist you further?"
 *  *  *             }
 */
public record OpenAiMessage(String role, String content) {
}

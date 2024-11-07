/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal;

/**
 *
 * @author HP 15-dw0043dx
 */

import com.example.proyectofinal.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelegramBotService {

    private final ChatMessageRepository chatMessageRepository;

    @Autowired
    public TelegramBotService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public void saveChatMessage(Long chatId, String message, String sender, String response) {
        // Lógica para guardar mensaje de chat
    }

    // Otros métodos para la lógica del bot
}

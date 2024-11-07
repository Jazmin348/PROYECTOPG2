
package com.example.proyectofinal;

/**
 *
 * @author benja
 */

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
public class ChatBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        Long chatId = update.getMessage().getChatId();
        System.out.println("Message Received: " + message);
        int length = message.length();
        System.out.println("The Message have " + length + " characters");
        sendMessage(generateSendMessage(chatId, length));
    }
    @Override
    public String getBotUsername() {
        //Nombre del bot
        return "HUT_4286_BOT";
    }
    
    @Override
    public String getBotToken(){
        //ingresa el token del bot
        return "7769863842:AAFnKFt6KrCyeiN0dsRum6Nq7GtSyig1gjs";
    }
    
     //we create a SendMessage with the text we want to send to the chat
    private SendMessage generateSendMessage(Long chatId, int characterCount) {
        return new SendMessage(chatId.toString(), "The Message have " + characterCount + " characters");
    }
    
    //send the message to Telegram API
    private void sendMessage(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    
}

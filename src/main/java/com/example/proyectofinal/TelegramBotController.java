/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectofinal;

/**
 *
 * @author HP 15-dw0043dx
 */

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telegram")
public class TelegramBotController {

    @PostMapping("/updates")
    public void receiveUpdate(@RequestBody String update) {
        // Procesa la actualización de Telegram
    }
}

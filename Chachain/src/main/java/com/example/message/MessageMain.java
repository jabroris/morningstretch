package com.example.message;

import io.javalin.Javalin;

public class MessageMain {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);

        app.get("/msg-decryption", ctx -> {
            Message message = ctx.bodyAsClass(Message.class);
            ctx.json(MessageController.decrypt(message.getEncryptedMsg()));
        });

        app.post("/msg-encryption",  ctx -> {
            Message message = ctx.bodyAsClass(Message.class);
            System.out.println(message.getDecryptedMsg() + " " + message.getSender());
            ctx.json(MessageController.encrypt(message));
        });
    }
}
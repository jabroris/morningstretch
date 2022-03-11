package com.example.message;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Message {

    @JsonProperty("encryptedMsg")
    String encryptedMsg;

    @JsonProperty("decryptedMsg")
    String decryptedMsg;

    @JsonProperty("sender")
    String sender;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
    Date date;

    public Message() {}

    public String getEncryptedMsg() {
        return encryptedMsg;
    }

    public void setEncryptedMsg(String encryptedMsg) {
        this.encryptedMsg = encryptedMsg;
    }

    public String getDecryptedMsg() {
        return decryptedMsg;
    }

    public void setDecryptedMsg(String decryptedMsg) {
        this.decryptedMsg = decryptedMsg;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

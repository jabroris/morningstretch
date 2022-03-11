package com.example.message;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class MessageController {

    static List<Message> msgs = new ArrayList<Message>();
    static Signature signature;
    static KeyPairGenerator keyPairGenerator;
    static Cipher cipher;
    static KeyPair keyPair;

    public static String decrypt(String encryptedMessage) {
        try {
            cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());
            byte[] decryptedMsg = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage));
            return new String(decryptedMsg, StandardCharsets.UTF_8);
        } catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static Message encrypt(Message message) {
        try {
            signature =  Signature.getInstance("SHA512withRSA");

            keyPairGenerator = KeyPairGenerator.getInstance("RSA");

            keyPairGenerator.initialize(1024);

            keyPair = keyPairGenerator.generateKeyPair();

            cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

            cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
            byte[] msgBytes = message.getDecryptedMsg().getBytes();
            cipher.update(msgBytes);

            byte[] encryptedMsg = cipher.doFinal();
            String base64Msg = Base64.getEncoder().encodeToString(encryptedMsg);
            message.setEncryptedMsg(base64Msg);
            msgs.add(message);
            return message;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }

        return message;
    }
}

package com.example.webcafe.email_java.email;

public interface EmailSender {
    void send(String to, String email);
    String buildEmail(String link);
}

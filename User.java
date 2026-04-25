package com.parking.Management;

// ABSTRACTION: This class is a template [cite: 86]
public abstract class User {
    // ENCAPSULATION: private variables protect data [cite: 17]
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter: Standard OOP practice [cite: 17]
    public String getUsername() {
        return username;
    }
}
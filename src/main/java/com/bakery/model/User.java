package com.bakery.model;

public class User {
    private int id;
    private String username;
    private String password;
    
    // Constructors
    public User() {
    }
    
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Methods from UML
    public String getUserInfo() {
        return "User ID: " + id + ", Username: " + username;
    }
    
    public void updatePhone(String newPhone) {
        // To be implemented by subclasses
    }
    
    public void updateEmail(String newEmail) {
        // To be implemented by subclasses
    }
    
    public int getId() {
        return this.id;
    }
}
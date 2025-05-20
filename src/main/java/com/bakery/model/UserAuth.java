package com.bakery.model;

public interface UserAuth {
    boolean login(String username, String password);
    void logout();
    void resetPassword(String email);
    boolean changePassword(String oldPassword, String newPassword);
    boolean register(String username, String email, String password);
}
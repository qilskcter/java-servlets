package com.example.buoi3;

public class UserDB {
    public static long insert(User user) {
        System.out.println("User inserted: " + user.getEmail());
        return 1;
    }
}
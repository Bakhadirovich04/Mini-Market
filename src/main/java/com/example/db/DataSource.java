package com.example.db;

import com.example.entity.User;
import com.example.entity.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class DataSource {
    public static void refresh(){
        strScanner = new Scanner(System.in);
        intScanner = new Scanner(System.in);
    }
    public static Scanner strScanner = new Scanner(System.in);
    public static Scanner intScanner = new Scanner(System.in);
    public static ArrayList<User> users = new ArrayList<>();
    @Getter
    @Setter
    public static User currentUser;

    static {
        users.add(new User(UUID.randomUUID().toString(),"saler","saler","saler", UserRole.SALER,new ArrayList<>()));
        users.add(new User(UUID.randomUUID().toString(),"a","a","a", UserRole.USER,new ArrayList<>()));
        users.add(new User(UUID.randomUUID().toString(),"b","b","b", UserRole.USER,new ArrayList<>()));
    }


}

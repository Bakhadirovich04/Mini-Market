package com.example;

import com.example.db.DataSource;
import com.example.services.AuthService;
import lombok.SneakyThrows;

public  class Main {
    @SneakyThrows
    public static void main(String[] args) {
        while (true) {
            DataSource.refresh();
                AuthService.service();
                Thread.sleep(5000);
                System.out.println("The program is closed..🚫");
        }
    }
}
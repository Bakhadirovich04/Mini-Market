package com.example;

import com.example.db.DataSource;
import com.example.services.AuthService;
import lombok.SneakyThrows;

public  class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            DataSource.refresh();
            try {
                AuthService.service();
                Thread.sleep(3000);
                System.out.println("The program is closed..🚫");
            } catch (InterruptedException e) {
            }

        }
    }
}
package com.example.services;

import static com.example.db.DataSource.intScanner;

public class SellerService {
    public static void service() {
        while (true) {
            System.out.print("""
                    0.exit
                    1.Add product
                    2.edit product
                    3.create shop
                    4.show shops
                    5.show history
                    6.delete profile
                    """);
            System.out.print("Select a command: ");
            switch (intScanner.nextInt()){
                case 0->{return;}
                case 1->{addProduct();}
                case 2->{editProduct();}
                case 3->{createShop();}
                case 4->{showShops();}
                case 5->{showHistory();}
                case 6->{deleteProfile();}
                default -> {
                    System.out.println("You cannot do such a thing....!");
                }
            }
        }
    }

    private static void deleteProfile() {
    }

    private static void showHistory() {

    }

    private static void showShops() {

    }

    private static void createShop() {

    }

    private static void editProduct() {

    }

    private static void addProduct() {

    }
}

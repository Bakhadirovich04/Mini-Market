package com.example.services;

import com.example.entity.User;
import com.example.entity.enums.UserRole;
import java.util.ArrayList;
import java.util.UUID;
import static com.example.db.DataSource.*;

public record AuthService() {
    public static void service(){
        while (true){
            System.out.print("""
                    0.exit
                    1.sign up
                    2.sign in
                    """);
            System.out.print("select a command: ");
            switch (intScanner.nextInt()){
                case 0->{
                    return;
                }
                case 1->{
                    User user=new User();
                    user.setId(UUID.randomUUID().toString());
                    System.out.print("Enter name: ");
                    user.setName(strScanner.nextLine());
                    System.out.print("Enter email: ");
                    user.setEmail(strScanner.nextLine());
                    System.out.print("Enter password: ");
                    user.setPassword(strScanner.nextLine());
                    System.out.println("""
                            1.User
                            2.Saler
                            """);
                    System.out.print("Select Role: ");
                    switch (intScanner.nextInt()){
                        case 1->user.setRole(UserRole.USER);
                        case 2->{user.setRole(UserRole.SALER);}
                        default -> {System.out.println("Action not found");}
                    }
                    user.setShops(new ArrayList<>());
                    signUp(user);
                }
                case 2->{
                    System.out.print("Enter password: ");
                    String pass=strScanner.nextLine();
                    System.out.print("Enter email: ");
                    String email=strScanner.nextLine();
                    boolean chekLogin=true;
                    for (User user : users) {
                        if(user.getEmail().equals(email)&&user.getPassword().equals(pass)){
                            setCurrentUser(user);
                            chekLogin=false;
                            break;
                        }
                    }
                    if(chekLogin){
                        System.out.println("There is no such password or login");
                    }
                    else{
                        signIn(getCurrentUser());
                    }

                }
            }
        }
    }

    private static void signIn(User user) {
        if (user.getRole().equals(UserRole.USER)){
           UserService.service();
        }
        else if(user.getRole().equals(UserRole.SALER)){
            SallerService.service();
        }
    }

    private static void signUp(User user) {
        if(!checkEmail(user.getEmail())){
            users.add(user);
            System.out.println("User registered successfully...✔️");
        }
        else{
            System.out.println("This email is busy");
        }
    }
    private static boolean checkEmail(String a) {
        for (User user : users) {
            if(user.getEmail().equals(a)){
                return true;
            }
        }
        return false;
    }
}

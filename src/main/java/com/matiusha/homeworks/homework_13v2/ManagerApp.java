package com.matiusha.homeworks.homework_13v2;

import java.util.List;

public class ManagerApp {
    public static void main(String[] args) {

        UsersDataMapper mapper = new UsersFileDataMapper();

        try {
            User id = mapper.findUserById("0");
            String username = id.getUsername();
            String email = id.getEmail();
            String role = id.getRole();
            System.out.println("User: " + username + " " + email + " - " + role);

        } catch (UsersNotFoundException ex) {
            System.out.println(ex.getMessage());
        }



        try {
            List<User> olga = mapper.findUserByUsername("Olga");

            for (User us:olga) {
                String username = us.getUsername();
                String email = us.getEmail();
                String role = us.getRole();
                System.out.println(us);
                System.out.println(username+email+role);

            }
            System.out.println("User: " );
        } catch (UsersNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            User emailUser = mapper.findUserByEmail("alex@gmail.com");
            String username = emailUser.getUsername();
            String email = emailUser.getEmail();
            String role = emailUser.getRole();
            System.out.println("User: " + username + " " + email + " - " + role);
        } catch (UsersNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
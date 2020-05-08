package com.matiusha.homeworks.homework_13v2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersFileDataMapper implements UsersDataMapper {

    private List<User> users = new ArrayList<>();

    public UsersFileDataMapper() {
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(new File("user-manager-hw13.txt")));
            String line;

            while ((line = br.readLine()) != null) {
                String items[] = line.split(" ");
                users.add(new User(items[0], items[1], items[2], items[3], items[4]));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException("not file");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Something went wrong");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }


    @Override
    public User findUserById(String id) {
        for (User us : users) {
            if (us.getId().equals(id))
                return us;
        }
        throw new UsersNotFoundException("User with id [" + id + "] was not found");
    }

    @Override
    public List<User> findUserByUsername(String username) {
        List<User> manyUsersname = new ArrayList<>();
        for (User us : users) {
            if (us.getUsername().equals(username)) {
                manyUsersname.add(us);
            }
            return manyUsersname;
        }
        throw new UsersNotFoundException("User with name [" + username + "] was not found");
    }

    @Override
    public User findUserByEmail(String email) {
        for (User us : users) {
            if (us.getEmail().equals(email))
                return us;
        }
        throw new UsersNotFoundException("User with email [" + email + "] was not found");
    }
}

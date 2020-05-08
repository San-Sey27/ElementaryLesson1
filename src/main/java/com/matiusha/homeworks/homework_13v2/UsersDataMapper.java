package com.matiusha.homeworks.homework_13v2;

import java.util.List;

public interface UsersDataMapper {

    User findUserById(String id);
    List<User> findUserByUsername(String username);
    User findUserByEmail(String email);
}

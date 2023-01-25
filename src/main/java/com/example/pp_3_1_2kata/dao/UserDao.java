package com.example.pp_3_1_2kata.dao;


import com.example.pp_3_1_2kata.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void removeUser(int id);

    User getUserById(int id);

    List<User> getListUsers();
}

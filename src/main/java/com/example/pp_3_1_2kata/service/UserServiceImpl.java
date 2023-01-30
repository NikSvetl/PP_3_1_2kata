package com.example.pp_3_1_2kata.service;

import com.example.pp_3_1_2kata.repositories.UserRepository;
import com.example.pp_3_1_2kata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    @Autowired
    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userRepo.save(user);

    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepo.save(user);

    }

    @Override
    @Transactional
    public void removeUser(int id) {
        userRepo.deleteById(id);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userRepo.getReferenceById(id);
    }

    @Override
    @Transactional
    public List<User> getListUsers() {

        return userRepo.findAll();
    }
}

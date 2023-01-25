package com.example.pp_3_1_2kata.repositories;


import com.example.pp_3_1_2kata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {
}

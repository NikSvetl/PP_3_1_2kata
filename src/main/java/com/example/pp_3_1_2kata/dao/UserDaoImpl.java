package com.example.pp_3_1_2kata.dao;


import com.example.pp_3_1_2kata.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void removeUser(int id) {
        Query query = entityManager.createQuery("DELETE FROM User WHERE id = :id ");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getListUsers() {
        return entityManager.createQuery("SELECT U FROM User U").getResultList();
    }
}

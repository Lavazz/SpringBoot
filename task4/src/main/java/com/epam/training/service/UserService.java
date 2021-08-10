package com.epam.training.service;

import com.epam.training.entity.User;

import java.util.List;

public interface UserService {

    User create(User entity);

    List<User> getAll();

    User findById(long id);

    void update(User entity);

    void delete(long id);
}
package com.epam.training.service;

import com.epam.training.dao.UserDao;
import com.epam.training.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService<User> {

    @Autowired
    UserDao userDao;

    @Override
    public User create(User entity) {
        return userDao.save(entity);
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(long id) {
        return userDao.findById(id).get();
    }

    @Override
    public void update(User entity) {
        userDao.save(entity);
    }

    @Override
    public void delete(long id) {
        userDao.deleteById(id);
    }
}
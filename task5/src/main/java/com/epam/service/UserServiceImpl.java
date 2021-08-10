package com.epam.service;

import com.epam.dao.UserDao;
import com.epam.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

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
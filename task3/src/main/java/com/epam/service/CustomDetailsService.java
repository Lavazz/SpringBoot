package com.epam.service;

import com.epam.autentification.CustomUser;
import com.epam.dao.UserDao;
import com.epam.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomDetailsService implements UserDetailsService {
    @Autowired
    UserDao userDao;

    @Override
    public CustomUser loadUserByUsername(final String username) throws UsernameNotFoundException {
        UserEntity userEntity;
        try {
            userEntity = userDao.getUserDetails(username);
            return new CustomUser(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
    }
}

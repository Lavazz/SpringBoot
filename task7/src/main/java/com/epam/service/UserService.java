package com.epam.service;

import java.util.List;

public interface UserService<T> {

    T create(T entity);

    List<T> getAll();

    T findById(long id);

    void update(T entity);

    void delete(long id);

}
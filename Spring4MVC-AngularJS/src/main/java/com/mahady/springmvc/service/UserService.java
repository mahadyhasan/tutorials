package com.mahady.springmvc.service;

import com.mahady.springmvc.model.User;

import java.util.List;

/**
 * Created by Mahady Hasan on 21/07/16.
 */
public interface UserService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);
}

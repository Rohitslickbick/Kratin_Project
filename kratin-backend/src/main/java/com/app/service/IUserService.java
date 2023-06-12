package com.app.service;

import java.util.List;

import com.app.pojo.User;

public interface IUserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
	User getUserByUsername(String username);
}

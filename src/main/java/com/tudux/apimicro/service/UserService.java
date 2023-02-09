package com.tudux.apimicro.service;

import com.tudux.apimicro.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);

    void deletedUser(Long userId);
}

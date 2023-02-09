package com.tudux.apimicro.service;

import com.tudux.apimicro.entity.User;
import com.tudux.apimicro.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElse(null);
        if (existingUser != null) {
          return  userRepository.save(user);
        } else {
            return null;
        }

    }

    @Override
    public void deletedUser(Long userId) {
        userRepository.deleteById(userId);
    }
}

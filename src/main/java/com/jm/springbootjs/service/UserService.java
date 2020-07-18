package com.jm.springbootjs.service;

import com.jm.springbootjs.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    User getUserById(Long userId);

    User getUserByEmail(String email);

    void addUser(User user);

    void editUser(User user);

    void deleteUserById(Long id);
}
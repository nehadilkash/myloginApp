package com.neha.mylogin.service;

import com.neha.mylogin.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

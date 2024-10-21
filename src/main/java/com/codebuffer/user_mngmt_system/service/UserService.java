package com.codebuffer.user_mngmt_system.service;

import com.codebuffer.user_mngmt_system.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(Long id);

    boolean deleteUser(Long id);

    User updateUser(Long id, User user);
}

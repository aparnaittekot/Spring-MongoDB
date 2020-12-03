package com.project.mongodb.repository;

import com.project.mongodb.model.User;

import java.util.List;

public interface UserTransaction {

    List<User> getAllUsers();

    User getUserById(String userId);

    User addNewUser(User user);

    Object getAllUserSettings(String userId);

    String getUserSetting(String userId, String key);

    String addUserSetting(String userId, String key, String value);
}

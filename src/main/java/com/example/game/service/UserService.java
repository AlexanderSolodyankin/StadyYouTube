package com.example.game.service;

import com.example.game.entity.UsersEntity;

import java.util.List;

public interface UserService {
    List<UsersEntity> getAllUsers();
    UsersEntity newUser(UsersEntity user);
    UsersEntity getUserName(String name);

}

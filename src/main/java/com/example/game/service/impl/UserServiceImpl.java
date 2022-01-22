package com.example.game.service.impl;

import com.example.game.entity.UsersEntity;
import com.example.game.repository.UserRepository;
import com.example.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UsersEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UsersEntity newUser(UsersEntity user) {
        user.setFifty(1);
        user.setPhone(1);
        user.setHall(1);
        return userRepository.save(user);
    }

    @Override
    public UsersEntity getUserName(String name) {
        UsersEntity user = userRepository.findByName(name).orElse(null);
        return user;
    }


}

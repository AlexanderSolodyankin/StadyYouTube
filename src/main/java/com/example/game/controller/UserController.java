package com.example.game.controller;

import com.example.game.entity.UsersEntity;
import com.example.game.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<UsersEntity> getAll(){
        return userService.getAllUsers();
    }

    @PostMapping("/newUser")
    public UsersEntity newUser(@RequestBody UsersEntity newUser){
        return userService.newUser(newUser);
    }
}

package com.example.game.main_controller;

import com.example.game.controller.UserController;
import com.example.game.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class UserControllerMain {
    @Autowired
    private UserController userRestController;

    @GetMapping
    public String main(Model model){
        model.addAttribute("menu","Игра как стать мелионером");
        return "menu";
    }

    @GetMapping("/newUser")
    public String newUser(Model model){
        UsersEntity user = new UsersEntity();
        model.addAttribute("NewUser", user);
        return "newUser";
    }

    @PostMapping("/newUser")
    public String newUser(@ModelAttribute("NewUser") UsersEntity user, Model model){
        System.out.println(user);
        user = userRestController.newUser(user);
        model.addAttribute("game", "Приветсвтуем тебя " + user.getName());
        return "game";
    }
}

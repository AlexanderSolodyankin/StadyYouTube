package com.example.game.main_controller;

import com.example.game.controller.UserController;
import com.example.game.entity.QuestEntity;
import com.example.game.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/")
public class UserControllerMain {
    @Autowired
    private UserController userRestController;

    @GetMapping
    public String main(Model model){
        model.addAttribute("menu","Игра как стать меллеонером");
        return "menu";
    }

    @GetMapping("/newUser")
    public String newUser(Model model){
        UsersEntity user = new UsersEntity();
        System.out.println("отправил на регистрацию" + user);
        model.addAttribute("NewUser", user);
        return "newUser";
    }

    @PostMapping("/newUser")
    public String newUser(@ModelAttribute("NewUser") UsersEntity user, Model model){
//        user = userRestController.newUser(user);
        QuestEntity questEntity = new QuestEntity();
        questEntity.setQuest("Первый вопрос");
        System.out.println("Принял после регистрации "  + user);
        model.addAttribute("gamer", user);
        model.addAttribute("quest", questEntity);
        return "game";
    }
}

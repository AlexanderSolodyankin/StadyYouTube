package com.example.game.main_controller;

import com.example.game.entity.QuestEntity;
import com.example.game.entity.UsersEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/game")
public class GameController {

    @PostMapping("/game")
    public String game(@ModelAttribute("gamer") UsersEntity user, @ModelAttribute("quest") QuestEntity questEntity, Model model){
        System.out.println("полученный вопрос " + questEntity);
        model.addAttribute("gamer",user);
        model.addAttribute("quest", questEntity);

        return "game";
    }


}

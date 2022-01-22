package com.example.game.controller;

import com.example.game.entity.Answer;
import com.example.game.entity.QuestEntity;
import com.example.game.service.AnswerService;
import com.example.game.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quest")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/getAll")
    public List<QuestEntity> getAllQuest(){
        return questionService.getAll();
    }

    @GetMapping("/getLevel/{level}")
    public List<QuestEntity> getLevel(@PathVariable Integer level){
        return questionService.getLevel(level);
    }

    @PostMapping("/newQuest")
    public QuestEntity newQuest(@RequestBody QuestEntity questEntity){
        return questionService.newQustion(questEntity);
    }
}

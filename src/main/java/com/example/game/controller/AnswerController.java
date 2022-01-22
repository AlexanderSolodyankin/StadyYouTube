package com.example.game.controller;

import com.example.game.entity.Answer;
import com.example.game.entity.QuestEntity;
import com.example.game.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @GetMapping("/all")
    public List<Answer> getAll(){
        return answerService.getAll();
    }

    @GetMapping("/getByQuest")
    public List<Answer> getByQuest(@RequestBody QuestEntity questEntity){
        return answerService.getByQuest(questEntity);
    }

    @PostMapping("/newAnswer")
    public List<Answer> newAnswers(@RequestBody Answer answerA, @RequestBody Answer answerB,
                                   @RequestBody Answer answerC, @RequestBody Answer answerD,
                                   @RequestBody QuestEntity questEntity){
        answerA.setQuestEntity(questEntity);
        answerB.setQuestEntity(questEntity);
        answerC.setQuestEntity(questEntity);
        answerD.setQuestEntity(questEntity);
        answerService.newAnswer(answerA);
        answerService.newAnswer(answerB);
        answerService.newAnswer(answerC);
        answerService.newAnswer(answerD);
        List<Answer> answerList = new ArrayList<>();
        answerList.add(answerA);
        answerList.add(answerB);
        answerList.add(answerC);
        answerList.add(answerD);
        return answerList;

    }
}

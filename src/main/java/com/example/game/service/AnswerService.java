package com.example.game.service;

import com.example.game.entity.Answer;
import com.example.game.entity.QuestEntity;

import java.util.List;

public interface AnswerService {
    List<Answer> getAll();
    List<Answer> getByQuest(QuestEntity questEntity);
    Answer newAnswer (Answer answer);
}

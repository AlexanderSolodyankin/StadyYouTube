package com.example.game.service;

import com.example.game.entity.QuestEntity;

import java.util.List;

public interface QuestionService {
    List<QuestEntity> getAll();
    List<QuestEntity> getLevel(int level);
    QuestEntity newQustion(QuestEntity questEntity);
}

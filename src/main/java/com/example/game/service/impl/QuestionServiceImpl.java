package com.example.game.service.impl;

import com.example.game.entity.QuestEntity;
import com.example.game.repository.QuestRepository;
import com.example.game.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestRepository questRepository;

    @Override
    public List<QuestEntity> getAll() {

        return questRepository.findAll();
    }

    @Override
    public List<QuestEntity> getLevel(int level) {
        return questRepository.findByLevel(level).orElse(null);
    }

    @Override
    public QuestEntity newQustion(QuestEntity questEntity) {

        return questRepository.save(questEntity);
    }
}

package com.example.game.service.impl;

import com.example.game.entity.Answer;
import com.example.game.entity.QuestEntity;
import com.example.game.repository.AnswerRepository;
import com.example.game.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<Answer> getAll() {
        return answerRepository.findAll();
    }

    @Override
    public List<Answer> getByQuest(QuestEntity questEntity) {
        return answerRepository.findByQuestEntity(questEntity).orElse(null);
    }

    @Override
    public Answer newAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}

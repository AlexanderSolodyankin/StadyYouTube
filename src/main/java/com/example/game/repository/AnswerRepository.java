package com.example.game.repository;

import com.example.game.entity.Answer;
import com.example.game.entity.QuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Optional<List<Answer>> findByQuestEntity (QuestEntity questEntity);
}

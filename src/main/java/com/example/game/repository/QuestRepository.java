package com.example.game.repository;

import com.example.game.entity.QuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestRepository extends JpaRepository<QuestEntity, Long> {
    Optional<List<QuestEntity>> findByLevel (Integer level);
}

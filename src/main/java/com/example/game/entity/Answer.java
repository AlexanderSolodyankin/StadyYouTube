package com.example.game.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String answer;
    private Boolean checkAnswer;

    @ManyToOne
    @JoinColumn(name="quest_entity_id")
    private QuestEntity questEntity;
}

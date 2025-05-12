package com.ewflorencio.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String questionTitle;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private String rightAnswer;
    private String difficultylevel;
    private String category;
}

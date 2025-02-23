package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "sqlExercises")
public class SQLExercise {
    @Id
    private String id;
    private String title;
    private String topic;
    private String difficulty;
    private String problemStatement;
    private List<String> options;
    private String correctOption;
    private String hint;          // New field: short hint for incorrect answer
    private String explanation;   // New field: detailed correct answer/explanation
}

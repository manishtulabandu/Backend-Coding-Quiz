package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.SQLExercise;

public interface SQLExerciseRepository extends MongoRepository<SQLExercise, String> {
    List<SQLExercise> findByTopicAndDifficulty(String topic, String difficulty);
    // You can add more custom query methods as needed.
}

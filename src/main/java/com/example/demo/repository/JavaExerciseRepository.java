package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.JavaExercise;

public interface JavaExerciseRepository extends MongoRepository<JavaExercise, String> {
    List<JavaExercise> findByTopicAndDifficulty(String topic, String difficulty);
}

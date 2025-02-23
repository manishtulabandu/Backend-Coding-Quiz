package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JavaExercise;
import com.example.demo.repository.JavaExerciseRepository;

@RestController
@RequestMapping("/exercises/java")
public class JavaExerciseController {

    @Autowired
    private JavaExerciseRepository exerciseRepository;

    @GetMapping
    public List<JavaExercise> getExercises() {
        return exerciseRepository.findAll();
    }
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SQLExercise;
import com.example.demo.repository.SQLExerciseRepository;

@CrossOrigin(origins = "http://localhost:3000") // Allow requests from your React app
@RestController
@RequestMapping("/exercises/sql")
public class SQLExerciseController {

    @Autowired
    private SQLExerciseRepository exerciseRepository;

    // GET endpoint with filtering options
    @GetMapping
    public List<SQLExercise> getExercises(
            @RequestParam(required = false) String topic,
            @RequestParam(required = false) String difficulty) {
        if (topic != null && difficulty != null) {
            return exerciseRepository.findByTopicAndDifficulty(topic, difficulty);
        } else {
            return exerciseRepository.findAll();
        }
    }

    // POST endpoint for submitting SQL query (stubbed evaluation)
    @PostMapping("/submit")
    public String submitAnswer(@RequestBody Submission submission) {
        // For now, just return a stubbed response.
        return "Evaluation logic pending: " + submission.getQuery();
    }

    // Additional endpoints for feedback can be added later.
}

// A simple DTO for submission
class Submission {
    private String query;
    // Getters and setters

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}

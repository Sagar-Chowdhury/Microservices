package com.quiz.QuizService.controllers;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {


    private QuizService quizService;

    public QuizController(QuizService quizService){
        this.quizService=quizService;
    }

    //  CREATE
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    // GET ALL
    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    // GET ONE
    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        return quizService.get(id);
    }

}

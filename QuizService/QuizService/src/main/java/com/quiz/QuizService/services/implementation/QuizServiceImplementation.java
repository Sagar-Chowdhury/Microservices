package com.quiz.QuizService.services.implementation;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImplementation implements QuizService {


    private QuizRepository quizRepository;

    public QuizServiceImplementation(QuizRepository quizRepository)
    {
        this.quizRepository=quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
      return quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
    }
}

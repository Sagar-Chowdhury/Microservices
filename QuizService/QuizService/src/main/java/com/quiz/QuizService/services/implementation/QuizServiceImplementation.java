package com.quiz.QuizService.services.implementation;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.services.QuestionClient;
import com.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImplementation implements QuizService {


    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionClient questionClient;


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        List<Quiz> allQuizzes = quizRepository.findAll();
       for(Quiz quiz:allQuizzes)
       {
           quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
       }
       return allQuizzes;
    }

    @Override
    public Quiz get(Long id) {
        Quiz quizById = quizRepository.findById(id).orElseThrow(()->new RuntimeException("No Quiz Found"));
        quizById.setQuestions(questionClient.getQuestionsOfQuiz(quizById.getId()));
        return quizById;
    }
}

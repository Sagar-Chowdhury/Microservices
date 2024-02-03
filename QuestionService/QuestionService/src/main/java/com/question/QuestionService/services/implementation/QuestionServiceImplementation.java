package com.question.QuestionService.services.implementation;

import ch.qos.logback.classic.spi.IThrowableProxy;
import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repositories.QuestionRepository;
import com.question.QuestionService.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplementation implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question create(Question question) {
       return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
       return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not Found"));
    }

    @Override
    public List<Question> getQuestionsOfTheQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}

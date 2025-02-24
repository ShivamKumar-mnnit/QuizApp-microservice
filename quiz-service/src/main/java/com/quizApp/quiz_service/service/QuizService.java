package com.quizApp.quiz_service.service;

import com.quizApp.quiz_service.dao.QuizDao;
import com.quizApp.quiz_service.feign.QuizInterface;
import com.quizApp.quiz_service.model.QuestionWrapper;
import com.quizApp.quiz_service.model.Quiz;
import com.quizApp.quiz_service.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizInterface quizInterface;


    public ResponseEntity<String> createQuiz(String category, int numQ,String title){

        List<Integer> quizInterface.getQuestionsForQuiz(category,numQ).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

//    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id){
//
//        Optional<Quiz> quiz = quizDao.findById(id);
//        List<Question> questionFromDB= quiz.get().getQuestions();
//        List<QuestionWrapper> questionsforUser = new ArrayList<>();
//
//        for(Question q : questionFromDB){
//            QuestionWrapper qw = new QuestionWrapper((q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4()));
//            questionsforUser.add(qw);
//        }
//
//        return new ResponseEntity<>(questionsforUser,HttpStatus.OK);
//    }
//
//
//    public ResponseEntity<Integer> calculateResult(Integer id,List<Response> responses){
//
//    }




}

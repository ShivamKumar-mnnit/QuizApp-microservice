package com.quizApp.quiz_service.feign;

import com.quizApp.quiz_service.model.QuestionWrapper;
import com.quizApp.quiz_service.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {

    @PostMapping("question/questionsFromIds")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);

    @PostMapping("question/calculateScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}

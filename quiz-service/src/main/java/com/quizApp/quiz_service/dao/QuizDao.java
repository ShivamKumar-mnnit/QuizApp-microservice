package com.quizApp.quiz_service.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {


}

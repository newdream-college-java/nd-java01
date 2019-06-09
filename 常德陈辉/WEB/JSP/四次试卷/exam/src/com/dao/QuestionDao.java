package com.dao;

import java.util.List;

import com.entity.Question;

public interface QuestionDao {
	List<Question> list(Integer subject);
	int result(Question question);
}

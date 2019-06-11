package dao;

import java.util.List;

import entity.Question;

public interface QuestionDao {
	List<Question> list(Integer subject);
	int add(Question question);
}

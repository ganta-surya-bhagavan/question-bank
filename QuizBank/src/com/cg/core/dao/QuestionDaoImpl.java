package com.cg.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.core.Exception.QuestionBankException;
import com.cg.core.dto.Question;

@Repository
public class QuestionDaoImpl implements QuestionDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Integer addEmp(Question question) throws QuestionBankException {
		try{
			manager.persist(question);
			manager.flush();
		}catch (Exception e) {
			throw new QuestionBankException("Error while Adding to Database", e);
		}finally {
			manager.close();
		}
		return question.getQuesNo();
	}

}

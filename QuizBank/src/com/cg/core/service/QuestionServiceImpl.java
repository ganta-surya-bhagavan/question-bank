package com.cg.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.core.Exception.QuestionBankException;
import com.cg.core.dao.QuestionDao;
import com.cg.core.dto.Question;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionDao dao;

	@Override
	@Transactional
	public Integer addQuestion(Question question) throws QuestionBankException {
		
		return	dao.addEmp(question);
	}

}

package com.cg.core.service;

import com.cg.core.Exception.QuestionBankException;
import com.cg.core.dto.Question;

public interface QuestionService {
	
	public Integer addQuestion(Question question) throws QuestionBankException;

}

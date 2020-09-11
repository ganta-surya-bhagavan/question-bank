package com.cg.core.dao;

import com.cg.core.Exception.QuestionBankException;
import com.cg.core.dto.Question;


public interface QuestionDao {
	public Integer addEmp(Question question) throws QuestionBankException;
}

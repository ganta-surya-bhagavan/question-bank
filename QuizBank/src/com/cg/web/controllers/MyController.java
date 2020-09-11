package com.cg.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.core.dto.Question;
import com.cg.core.service.QuestionService;


//http://localhost:9090/QuizBank_46022719/questions/home.do
@Controller
@RequestMapping("/questions")
public class MyController {
	@Autowired
	private QuestionService service;
	
	@RequestMapping("/home.do")
	public String getHomePage(){
		return "Home";
	}
	
	@RequestMapping("/addQuestion.do")
	public String getInsertPage(){
		return "AddQuestion";
	}
	
	@RequestMapping("/insert.do")
	public ModelAndView insert(@RequestParam("subtopic") String subtopic,
			@RequestParam("category") String quesCategory,
			@RequestParam("question") String question,
			@RequestParam("option1") String option1,
			@RequestParam("option2") String option2,
			@RequestParam("option3") String option3,
			@RequestParam("option4") String option4,
			@RequestParam("answer") int answer,
			@RequestParam("reviewCnt") int reviewCnt){
		
		ModelAndView mAndV=null;
		Question ques=new Question(quesCategory, question, option1, option2, option3, option4, answer);
		ques.setQuesSubtopic(subtopic);
		ques.setReviewCnt(reviewCnt);
		try{
			int quesId=service.addQuestion(ques);
			mAndV=new ModelAndView("AddQuestion");
			mAndV.addObject("msg","Added to Database with ID:"+quesId);
		}catch (Exception e) {
			mAndV=new ModelAndView("Error");
			mAndV.addObject("error", e);
			return mAndV;
		}
		return mAndV;
			
		
	}


}

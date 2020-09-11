package com.cg.core.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Question_Master")
public class Question {
	@Id
	@Column(name="Ques_no")
	@SequenceGenerator(name = "COL_GEN", sequenceName = "SEQ_TABLE", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "COL_GEN")
	private int quesNo;
	
	@Column(name="Ques_subtopic")
	private String quesSubtopic;
	
	@Column(name="Ques_category")
	private String quesCategory;
	
	@Column(name="Question")
	private String question;
	
	@Column(name="Option1")
	private String option1;
	
	@Column(name="Option2")
	private String option2;
	
	@Column(name="Option3")
	private String option3;
	
	@Column(name="Option4")
	private String option4;
	
	@Column(name="Answer")
	private int answer;

	@Column(name="Review_cnt")
	private int reviewCnt;

	public int getQuesNo() {
		return quesNo;
	}

	public void setQuesNo(int quesNo) {
		this.quesNo = quesNo;
	}

	public String getQuesCategory() {
		return quesCategory;
	}

	public void setQuesCategory(String quesCategory) {
		this.quesCategory = quesCategory;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public String getQuesSubtopic() {
		return quesSubtopic;
	}

	public void setQuesSubtopic(String quesSubtopic) {
		this.quesSubtopic = quesSubtopic;
	}

	public int getReviewCnt() {
		return reviewCnt;
	}

	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}

	@Override
	public String toString() {
		return "Question [quesNo=" + quesNo + ", quesSubtopic=" + quesSubtopic + ", quesCategory=" + quesCategory
				+ ", question=" + question + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", answer=" + answer + ", reviewCnt=" + reviewCnt + "]";
	}

	public Question(String quesCategory, String question, String option1, String option2, String option3,
			String option4, int answer) {
	
		this.quesCategory = quesCategory;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}

	public Question() {
		
	}
	
	
	
}

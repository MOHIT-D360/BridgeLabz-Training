package com.examproctor;

public class Question {
	String question;
	double answer;
	
	int id;
	Question(int id , String question, double answer){
		this.id  = id;
		this.question = question;
		this.answer = answer;
	}
	void showQuestion(){
		System.out.println(id+ " : "+ question);
	}
	
}

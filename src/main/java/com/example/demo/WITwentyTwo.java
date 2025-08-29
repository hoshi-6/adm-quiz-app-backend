// src/main/java/com/example/quizappbackend/model/WITwentyTwo.java
package com.example.demo;

import jakarta.persistence.Column; // @Columnアノテーションをインポート
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WITwentyTwo")
public class WITwentyTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Columnアノテーションで、Javaの変数とDBの列名を正確に対応させる
    @Column(name = "question_text")
    private String questionText;

    @Column(name = "option_a")
    private String optionA;

    @Column(name = "option_b")
    private String optionB;

    @Column(name = "option_c")
    private String optionC;

    @Column(name = "option_d")
    private String optionD;

    @Column(name = "option_e")
    private String optionE;

    @Column(name = "correct_option")
    private String correctOption;

    @Column(name = "correct_option2")
    private String correctOption2;

    @Column(name = "correct_option3")
    private String correctOption3;

    @Column(name = "explanation")
    private String explanation;
    
    // --- GetterとSetterは変更なし ---
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getQuestionText() {
		return questionText;
	}
	
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	public String getOptionA() {
		return optionA;
	}
	
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	
	public String getOptionB() {
		return optionB;
	}
	
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	
	public String getOptionC() {
		return optionC;
	}
	
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	
	public String getOptionD() {
		return optionD;
	}
	
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	public String getOptionE() {
		return optionE;
	}
	
	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}
	
	public String getCorrectOption() {
		return correctOption;
	}
	
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}
	
	public String getCorrectOption2() {
		return correctOption2;
	}
	
	public void setCorrectOption2(String correctOption2) {
		this.correctOption2 = correctOption2;
	}
	
	public String getCorrectOption3() {
		return correctOption3;
	}
	
	public void setCorrectOption3(String correctOption3) {
		this.correctOption3 = correctOption3;
	}
	
	public String getExplanation() {
		return explanation;
	}
	
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
}

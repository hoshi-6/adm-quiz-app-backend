// src/main/java/com/example/quizappbackend/controller/QuestionController.java
package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/questions")
// 3000番と3001番の両方からのアクセスを許可するように修正
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class QuestionController {

	@Autowired
	private WITwentyOneRepository wiTwentyOneRepository;

	@GetMapping("/WI21")
	public List<WITwentyOne> getWi21Questions() {
		return wiTwentyOneRepository.findAll();
	}

	@Autowired
	private WITwentyTwoRepository wiTwentyTwoRepository;

	@GetMapping("/WI22")
	public List<WITwentyTwo> getWi22Questions() {
		return wiTwentyTwoRepository.findAll();
	}

	@Autowired
	private SPTwentyTwoRepository spTwentyTwoRepository;

	@GetMapping("/SP22")
	public List<SPTwentyTwo> getSp22Questions() {
		return spTwentyTwoRepository.findAll();
	}
}

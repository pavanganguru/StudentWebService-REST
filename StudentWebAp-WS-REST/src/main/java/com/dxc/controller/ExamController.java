package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dao.ExamRepository;
import com.dxc.model.Exam;

@RestController
public class ExamController {

	@Autowired
	ExamRepository examRepository;
	
	@GetMapping("exams")
	public List<Exam> getExams()
	{
		List<Exam> exams = (List<Exam>) examRepository.findAll();
		return exams;
	}
	
	@GetMapping(path="exam/{id}")
	public Exam getStudent(@PathVariable("id") String id) 
	{
		Exam exam = examRepository.findById(id).orElse(new Exam());
		return exam;
	}	
	
	@PostMapping("exam")
	public Exam save(Exam exam)
	{
		return examRepository.save(exam);
	}
}
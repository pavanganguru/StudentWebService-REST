package com.dxc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dao.StudentRepository;
import com.dxc.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping(value="students")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Student> students() {
		List<Student>  students = studentRepository.findAll();
		return students;
	}
	
	@GetMapping(path="student/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Student student(@PathVariable int id) {
		Student student = studentRepository.findById(id).orElse(new Student());
		return student;
	}
	
	@PostMapping("student")
	@CrossOrigin(origins = "http://localhost:4200")
	public String addstudent(@RequestBody Student student) {
		
		studentRepository.save(student);
		return "inserted successfully";
	}
	
	@PutMapping("student")
	@CrossOrigin(origins = "http://localhost:4200")
	public Student update(Student student)
	{
		return   ((StudentController) studentRepository).update(student);
		
	}
	
	@DeleteMapping(path = "student/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public void delete(@PathVariable("id") int id)
	{
	studentRepository.deleteById(id);	
	}
}

package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dao.StudentRepository;
import com.dxc.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("students")
	public List<Student> students() {
		List<Student>  students = studentRepository.findAll();
		return students;
	}
	
	@GetMapping(path="student/{id}")
	public Student student(@PathVariable int id) {
		Student student = studentRepository.findById(id).orElse(new Student());
		return student;
	}
	
	@PostMapping("student")
	public Student addstudent(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	
	@PutMapping("student")
	public Student update(Student student)
	{
		return   ((StudentController) studentRepository).update(student);
		
	}
	
	@DeleteMapping(path = "student/{id}")
	public void delete(@PathVariable("id") int id)
	{
	studentRepository.deleteById(id);	
	}
}

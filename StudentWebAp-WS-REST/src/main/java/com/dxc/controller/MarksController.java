package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Marks;
import com.dxc.dao.MarksRepository;

@RestController
public class MarksController {
	
	@Autowired
	MarksRepository marksRepository;
	
	@GetMapping("marks")
	public List<Marks> getMarks()
	{
		List<Marks> marks = (List<Marks>) marksRepository.findAll();
		return marks;
	}
	
	@GetMapping(path="mark/{id}")
	public Marks getMark(@PathVariable("id") int id) 
	{
		Marks mark = marksRepository.findById(id).orElse(new Marks());
		return mark;
	}
	
	@PostMapping("mark")
	public Marks save(@RequestBody Marks mark)
	{
		return marksRepository.save(mark);
	}
	
	@PutMapping("mark")
	public Marks update(Marks mark)
	{
		return ((MarksController) marksRepository).update(mark);
	}

}
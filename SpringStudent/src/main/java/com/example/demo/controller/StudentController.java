package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/getByName/{name}")
	public List<Student> getBySytudent(@PathVariable("name") String name) {
		return studentService.findByName(name);

	}

	@PostMapping("/post")
	public Student post(@RequestBody Student student) {
		return studentService.post(student);
	}
	@PutMapping("/put")
	public Student put(@RequestBody Student student) {
		return studentService.put(student);
	}
	@DeleteMapping("/delete")
	public String removeStudent(String name)
	{
		return studentService.deleteStudent(name);
		
	}
	

}
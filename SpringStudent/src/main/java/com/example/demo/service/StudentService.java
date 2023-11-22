package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepository;

	public List<Student> findByName(String name) {
		return studentrepository.findByName(name);
	}

	public Student post(Student student) {
		return studentrepository.save(student);
	}

	public Student put(Student student) {
		return studentrepository.save(student);
	}

	public String deleteStudent(String name) {
		List<Student> list = studentrepository.findByName(name);
		 studentrepository.deleteAll(list);
		 return "deleted";
	}

}

package com.example.demo;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@WebMvcTest(value = StudentService.class)
public class StudentTest {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	StudentService studentService;

	@Test
	void testGetByName() {

		List<Student> list = new ArrayList<>();

		Student student = new Student(25,"chandu",34333);
		list.add(student);
		when(studentService.findByName("chandu")).thenReturn(list);
	}
}

package com.example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.soap.Student;

@RestController
public class RestAPI {
	@Autowired
	StudentUtility studentUtility;
	
	@RequestMapping(path="/students")
	public Map<Integer, Student> getStudents() {
		return studentUtility.getMap();
	}
	
	@RequestMapping(path="/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentUtility.getStudent(id);
	}
	
	@RequestMapping(path="/students/random")
	public Student getRandom() {
		return studentUtility.getStudent((int) (Math.random()*5+1));
	}

}
//test
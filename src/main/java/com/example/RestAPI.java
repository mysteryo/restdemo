package com.example;

import java.util.Map;

import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.soap.Student;

@RestController
public class RestAPI {
	@Autowired
	StudentUtility studentUtility;
	
	@GetMapping(path="/students")
	@Timed(
			value = "restapi.students.endpoint"
	)
	public Map<Integer, Student> getStudents() {
		System.out.println("LOG: Get all");
		return studentUtility.getMap();
	}
	
	@RequestMapping(path="/students/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		System.out.println("LOG: Get student "+id);
		return studentUtility.getStudent(id);
	}
	
	@RequestMapping(path="/students/random")
	public Student getRandom() {
		System.out.println("LOG: Get random");
		return studentUtility.getStudent((int) (Math.random()*5+1));
	}

}
//test
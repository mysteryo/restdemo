package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.soap.Student;


@Component
public class StudentUtility {
	private Map<Integer, Student> studentMap = new HashMap<Integer,Student>();

	public StudentUtility() {
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setName("George");
		s1.setAge(20);
		s1.setClazz("AAA");
		studentMap.put(1, s1);
		
		Student s2 = new Student();
		s2.setStudentId(2);
		s2.setName("Lucy");
		s2.setAge(21);
		s2.setClazz("XYZ");
		studentMap.put(2, s2);
		
		Student s3 = new Student();
		s3.setStudentId(3);
		s3.setName("Lucas");
		s3.setAge(18);
		s3.setClazz("BBB");
		studentMap.put(3, s3);
		
		Student s4 = new Student();
		s4.setStudentId(4);
		s4.setName("Peter");
		s4.setAge(22);
		s4.setClazz("CAC");
		studentMap.put(4, s4);
		
		Student s5 = new Student();
		s5.setStudentId(5);
		s5.setName("Jane");
		s5.setAge(19);
		s5.setClazz("QQQ");
		studentMap.put(5, s5);
		}
	
	public Student getStudent(int studentId){
		return studentMap.get(studentId);
	}
	
	public Map<Integer, Student> getMap(){
		return studentMap;
	}
	
	
}

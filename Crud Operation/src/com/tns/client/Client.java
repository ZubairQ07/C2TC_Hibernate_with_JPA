package com.tns.client;

import com.tns.entity.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {
	
	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		
		//create operation
		student.setStudentid(11);
		student.setName("Zubair");
		service.addStudent(student);
		
		
		//we added one entry to the SQL database table
		//retrieve operation
//		student=service.findStudentById(11);
//		System.out.print("ID:"+student.getStudentid());
//		System.out.println("Name:"+student.getName());
//		
		//update operation
//		student=service.findStudentById(11);
//		student.setName("Zubair Qureshi");
//		service.updateStudent(student);
//		
		//delete operation
//		student=service.findStudentById(11);
//		service.removeStudent(student);
//		System.out.println("End of The Program/Life cycle ended......");
//		
	}

}

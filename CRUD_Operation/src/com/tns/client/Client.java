package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService; 
import com.tns.service.StudentServiceImpl; 
  
public class Client { 
 
 	public static void main(String[] args) { 
 
 	 	//Debug this program as Debug -> Debug as Java 
//Application 
 	 	 
 	 	StudentService service = new StudentServiceImpl(); 
 	 	 
 	 
 	 	Student student = new Student(); 
 	 	
// 	 	  Create Operation  	 	
 	 	student.setStudentid(7777);	 	
 	 	student.setName("Zubair"); 
 	 	service.addStudent(student); 
// 	 at this breakpoint, we have added one record to table 
 	 	 
 	 	 
 	 	// Retrieve Operation 
// 	 	student = service.findStudentById(1);  	 	 
// 	 	System.out.print("ID:"+student.getStudentid());
// 	 	System.out.println(" Name:"+student.getName());  
// 	 
 	 	  
 
 	 	// Update Operation 
// 	 	student = service.findStudentById(7777);  	 	
// 	 	student.setName("Zubair Qureshi");  	 	
// 	 	service.updateStudent(student); 
 	 	 
//at this breakpoint, we have updated record added in first section 
 	 	 
// 	 	student = service.findStudentById(7777);  	 	
// 	 	System.out.print("ID:"+student.getStudentid()); 
// 	 	System.out.println(" Name:"+student.getName());   
 	 	 
 	 
 	 	//at this breakpoint, record is removed from table 
 	 	// Delete Operation 
// 	 	student = service.findStudentById(7777);  	 	
// 	 	service.removeStudent(student); 
// 	System.out.println("End of program/Life cycle completed...");   
 	 
 	 
 	 	
 	 	
 	 	
 	 	/*
 	 		do
 	 		{
 	 			System.out.println("1]Insert Student");
 	 			System.out.println("2]Display Details of Student");
 	 			System.out.println("3]Update Student Details");
 	 			System.out.println("4]Delete Student Details");
 	 			System.out.println("5]Exit");
 	 			
 	 		
 	 			Scanner sc=new Scanner(System.in);
 	 	 	 	int ch;
 	 	 	 	System.out.println("Enter Your Choice");
 	 	 	 	ch=sc.nextInt();
 	 	 	 	
 	 	 	 	switch(ch)
 	 	 	 	{
 	 	 	 	case 1:
		 	 	 	 	student.setStudentid(100);  	 	
		 	 	 	 	student.setName("Sachin"); 
		 	 	 	 	service.addStudent(student); 
		 	 	 	 	break;
		 	 	 	 	
 	 	 	 	case 2:
		 	 	 	 	student = service.findStudentById(100);  	 	 
		 	 	 	 	System.out.print("ID:"+student.getStudentid());
		 	 	 	 	System.out.println(" Name:"+student.getName());  
		 	 	 	 	break;
		 	 	 	 	
 	 	 	 	case 3:
 	 	 	 			
		 	 	 	 	student = service.findStudentById(100);  	 	
		 	 	 	 	student.setName("Sachin Tendulkar");  	 	
		 	 	 	 	service.updateStudent(student);
		 	 	 	 	break;
 	 	 	 	case 4:
 	 	 	 			
		 	 	 	 	student = service.findStudentById(100);  	 	
		 	 	 	 	service.removeStudent(student);
		 	 	 	 	break;
 	 	 	 	case 5:
 	 	 	 		System.out.println("Invalid Choice");
 	 	 	 		System.exit(0);
 	 	 	 		break;
 	 	 	 	}
 	 	
 	 	 	 	
 	 	 	 System.out.println("End of program/Life cycle completed..."); 
 	 	}while(true);
 	 	*/
 	 	//System.out.println("End of program/Life cycle completed...");
 	 	
 	 		
 	 	 
 
 	} 
 	
} 


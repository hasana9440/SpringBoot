package com.hasana.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hasana.Entity.Student;
import com.hasana.service.IMgmtService;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	IMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			/*
			 * Student s1 = new Student(108,"Gopi","Mech","KITS","Male","Goip@email.com");
			 * Student s2 = new
			 * Student(102,"Smith","EEE","Vignan","Male","Smith@email.com"); Student s3 =
			 * new Student(103,"Rahul","ECE","KLU","Male","Rahul@email.com"); Student s4 =
			 * new Student(104,"Gita","IT","NRI","Fe-Male","Gita@email.com"); Student s5 =
			 * new Student(105,"Setupathi","Bio-Petrol","CLPT","Male","Setu@email.com");
			 * Student s6 = new Student(106,"vijay","CSE","TEC","Male","vjy@email.com");
			 * Student s7 = new
			 * Student(107,"Sudeshan","Civil","NEC","Male","desh@email.com"); Student s8 =
			 * new Student(108,"Mahesh","CSE","KITS","Male","mahi@email.com");
			 * //System.out.println(service.insert(s1)); //single Record insertion
			 * Iterable<Student> list = List.of(s1,s2,s3,s4,s5,s6,s7,s8);//multiple records
			 * insertion System.out.println(service.insertAll(list));
			
			 */
			
			//**************Existed By id
			
			/*
			 * if(service.existById(105)) { System.out.println("Record is exist"); } else {
			 * System.out.println("record does.t exist"); }
			 */
			
			//*************** finding records ******************
				/*Iterable<Student> list = service.findAll();
				list.forEach(System.out::println);*/
				
				Iterable<Student> list = service.findByid(List.of(101,106,107));
				list.forEach(System.out::println);
			
			
			//******************
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}

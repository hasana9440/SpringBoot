package com.hasana.service;

import com.hasana.Entity.Student;

public interface IMgmtService {
	//Record Insertion methods
	public String insert(Student s);
	public String insertAll(Iterable<Student> s );
	//seraching for ExistBy Id value
	public boolean existById(Integer id);
	//to find number of records present in database
	public Long countRecords();
	//finding records
	public Iterable<Student> findAll();
	public Iterable<Student> findByid(Iterable <Integer> id);
}

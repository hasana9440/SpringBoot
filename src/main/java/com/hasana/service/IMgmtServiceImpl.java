package com.hasana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasana.Entity.Student;
import com.hasana.Repository.IStudentRepository;
@Service("Student_Details")
public class IMgmtServiceImpl implements IMgmtService {

	@Autowired
	IStudentRepository repo;
	@Override
	public String insert(Student s) {
		repo.save(s);
		return "Record is saved Succesfully " ;
	}
	@Override
	public String insertAll(Iterable<Student> s) {
		Iterable<Student> list = repo.saveAll(s);
		return "All Records are saved ";
	}
	@Override
	public boolean existById(Integer id) {
		return repo.existsById(id);
		
	}
	@Override
	public Long countRecords() {
		
		return repo.count();
	}
	@Override
	public Iterable<Student> findAll() {
		Iterable<Student> list = repo.findAll();
		return list;
	}
	@Override
	public Iterable<Student> findByid(Iterable<Integer> id) {
		Iterable<Student> list = repo.findAllById(id);
		return list;
	}


}

package com.hasana.Repository;

import org.springframework.data.repository.CrudRepository;

import com.hasana.Entity.Student;

public interface IStudentRepository extends CrudRepository<Student,Integer> {

}

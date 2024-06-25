package com.hasana.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT_DETAILS")
@AllArgsConstructor
public class Student {
	@Column(name = "ID")
	@Id
	public Integer id;
	@Column(name="Student_Name",length=20)
	public String name;
	@Column(name="Branch",length=20)
	public String branch;
	@Column(name="College",length=20)
	public String college;
	@Column(name="Gender",length=10)
	public String gender;
	@Column(name="Email",length=30)
	public String email;
	public Student() {
		System.out.println("Student.Student()::Starts here........");
	}
	
}

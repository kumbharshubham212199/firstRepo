package com.pract.Studentdao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.pract.Student;

public class StudentDao {
	
	HibernateTemplate hibernateTemplate;
	@Transactional
	public void insert(Student student) {
	this.hibernateTemplate.save(student);
	}

}

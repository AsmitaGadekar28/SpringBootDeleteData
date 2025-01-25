package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student;
@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;
	
	public String DeleteData(int stud_id) {
		Session session= factory.openSession();
		Transaction tr= session.beginTransaction();
		Student s1= session.get(Student.class, stud_id);
		session.remove(s1);
		tr.commit();
		session.close();
		return "Data is Deleted...";
	}
}

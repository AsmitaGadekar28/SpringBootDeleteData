package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public String DeleteData(int stud_id) {
		String msg=dao.DeleteData(stud_id);
		return msg;
	}
}

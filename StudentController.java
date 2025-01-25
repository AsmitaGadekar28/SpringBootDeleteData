package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.tka.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	StudentService service;
	
	@DeleteMapping("/deleteData/{stud_id}")
	public String DeleteData(@PathVariable int stud_id) {
		String msg= service.DeleteData(stud_id);
		return msg;
	}
}

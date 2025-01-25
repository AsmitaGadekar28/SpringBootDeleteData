package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stud_id;
	private String stud_name;
	private String city;
	private String stud_dept;
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStud_dept() {
		return stud_dept;
	}
	public void setStud_dept(String stud_dept) {
		this.stud_dept = stud_dept;
	}
	public Student(int stud_id, String stud_name, String city, String stud_dept) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.city = city;
		this.stud_dept = stud_dept;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", city=" + city + ", stud_dept="
				+ stud_dept + "]";
	}
	
	
	
	}

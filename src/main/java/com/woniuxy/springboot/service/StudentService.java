package com.woniuxy.springboot.service;

import java.util.List;

import com.woniuxy.springboot.entity.Student;

public interface StudentService {
	public List<Student> selectAll();
	public void insert();
}

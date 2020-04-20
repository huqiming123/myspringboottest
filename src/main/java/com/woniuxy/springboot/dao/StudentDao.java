package com.woniuxy.springboot.dao;

import java.util.List;

import com.woniuxy.springboot.entity.Student;

public interface StudentDao {
	public List<Student> selectAll();
	public void insert(Student student);
}

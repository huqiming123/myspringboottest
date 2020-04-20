package com.woniuxy.springboot;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.springboot.dao.StudentDao;
import com.woniuxy.springboot.entity.Student;
import com.woniuxy.springboot.service.StudentService;

@SpringBootTest
class Myspringboot3ApplicationTests {
	@Autowired
	StudentService studentService;
	@Autowired
	StudentDao studentDao;
	@Autowired
	DataSource dataSource;
	@Test
	void contextLoads() {
	}
	@Test
	void testSelectAll() {
		System.out.println(studentService.selectAll());
	}
	@Test
	void testSelectAll1() {
		System.out.println(studentDao.selectAll());
	}
	@Test
	void testInsert() {
		studentService.insert();
	}
	@Test
	void testInsert1() {
		studentDao.insert(new Student(null, "小二逼", 15));
	}
	@Test
	void testDataSource() {
		System.out.println(dataSource);
		System.out.println(dataSource.getClass().getName());
	}

}

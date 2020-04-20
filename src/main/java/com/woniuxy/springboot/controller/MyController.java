package com.woniuxy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.springboot.entity.Student;
import com.woniuxy.springboot.service.StudentService;

@Controller
public class MyController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/select")
	@ResponseBody
	public List<Student> select() {
		return studentService.selectAll();
	}
}

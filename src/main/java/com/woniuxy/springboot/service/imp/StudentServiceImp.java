package com.woniuxy.springboot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.springboot.dao.StudentDao;
import com.woniuxy.springboot.entity.Student;
import com.woniuxy.springboot.service.StudentService;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	StudentDao studentDao;
	@Override
	public List<Student> selectAll() {
		List<Student> list=studentDao.selectAll();
		return list;
	}
	@Transactional
	@Override
	public void insert() {
		studentDao.insert(new Student(null, "王小二", 21));
		if(true) {
			throw new RuntimeException("异常");
		}
		studentDao.insert(new Student(null, "王二狗", 27));
	}

}

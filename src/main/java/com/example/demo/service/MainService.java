package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.exception.CustonException;
import com.example.demo.repo.StudentServiceRepo;

@Service
public class MainService {
	
	@Autowired
	private StudentServiceRepo studentServiceRepo;

	public String addDataService(StudentEntity studentEntity) {
		try {
			studentServiceRepo.save(studentEntity);
			return "Okey";
		}
		catch(Exception e) {
			throw new CustonException(e.getMessage());
		}
	}

	public List<StudentEntity> getStudentList() {
		try {
			return studentServiceRepo.findAll();
		}
		catch(Exception e) {
			throw new CustonException(e.getMessage());
		}
	}
}

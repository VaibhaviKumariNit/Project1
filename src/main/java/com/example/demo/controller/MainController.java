package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.exception.CustonException;
import com.example.demo.repo.StudentServiceRepo;
import com.example.demo.service.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/main")
	public List<StudentEntity> test() {
		try {
			return this.mainService.getStudentList();
		}
		catch(Exception e) {
			throw new CustonException(e.getMessage());
		}
	}
	@PostMapping("/addStudentData")
	public String addData(@RequestBody StudentEntity entity) {
		try {
			return this.mainService.addDataService(entity);
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new CustonException(e.getMessage());
		}
	}
}

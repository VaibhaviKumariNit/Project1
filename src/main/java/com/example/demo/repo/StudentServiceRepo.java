package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;

@Repository
public interface StudentServiceRepo extends JpaRepository<StudentEntity, Integer>{

}

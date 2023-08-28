package com.suresh.StudentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suresh.StudentSystem.Model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}

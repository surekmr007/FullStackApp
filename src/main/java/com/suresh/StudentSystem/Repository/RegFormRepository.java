package com.suresh.StudentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suresh.StudentSystem.Model.RegForm;

@Repository


public interface RegFormRepository extends JpaRepository<RegForm, Integer> {

}

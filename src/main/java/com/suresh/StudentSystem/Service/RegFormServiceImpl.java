package com.suresh.StudentSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.StudentSystem.Model.RegForm;
import com.suresh.StudentSystem.Repository.RegFormRepository;

@Service
public class RegFormServiceImpl implements RegFormService {

	@Autowired
	private RegFormRepository regFormRepository;


	@Override
	public RegForm saveUsers(RegForm regForm) {
		return regFormRepository.save(regForm);
	}

	@Override
	public List<RegForm> getAllUsers() {
		return regFormRepository.findAll();
	}

	@Override
	public RegForm getUserByEmail(String email) {
		return regFormRepository.findByEmail(email);
	}

}

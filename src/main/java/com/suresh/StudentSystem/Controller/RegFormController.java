package com.suresh.StudentSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.StudentSystem.Model.RegForm;
import com.suresh.StudentSystem.Service.RegFormService;

@CrossOrigin
@RestController
@RequestMapping("/reg")
public class RegFormController {
	
	@Autowired
	private RegFormService regFormService;
	
	@PostMapping("/add")
	public String add(@RequestBody RegForm regForm) {
		regFormService.saveUsers(regForm);
		return "new User is added";
	}
	
	@GetMapping("/getUser")
	public List<RegForm> getAllUsers() {
		return regFormService.getAllUsers();
	}


}

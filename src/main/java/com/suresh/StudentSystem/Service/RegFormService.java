package com.suresh.StudentSystem.Service;

import java.util.List;

import com.suresh.StudentSystem.Model.RegForm;

public interface RegFormService {
	public RegForm saveUsers(RegForm regForm);

	public List<RegForm> getAllUsers();
}

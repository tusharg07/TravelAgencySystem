package com.Sprinfboot.Project.tas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprinfboot.Project.My.Service.ManagerService;
import com.Sprinfboot.Project.tas.Entity.Manager;

@RestController
public class ManagerController {
	
	@Autowired
	private ManagerService ms;
	
	@GetMapping("allManagers")
	public List<Manager> getManagerInfo() {
		return ms.getManagerInfo();
	}

}

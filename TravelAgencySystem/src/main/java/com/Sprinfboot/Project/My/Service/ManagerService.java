package com.Sprinfboot.Project.My.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Sprinfboot.Project.tas.Dao.ManagerDao;
import com.Sprinfboot.Project.tas.Entity.Manager;


@Service

public class ManagerService {
//	
//	public ManagerService(String check) {
//	       
//	}
	
	@Autowired
	private ManagerDao dao;
	
	public List<Manager> getManagerInfo() {
		return dao.getManagerInfo();
		
	}

}

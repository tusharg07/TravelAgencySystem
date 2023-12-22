package com.Sprinfboot.Project.tas.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Sprinfboot.Project.tas.Entity.Manager;

@Repository
public class ManagerDao {
	
	@Autowired
	private SessionFactory sf;

	public List<Manager> getManagerInfo() {
		
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		List<Manager> list = criteria.list();
		return list;
		
	}

}

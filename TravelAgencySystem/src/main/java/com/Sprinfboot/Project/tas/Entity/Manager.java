package com.Sprinfboot.Project.tas.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	
	private int id;
	private String name;
	private String salary;
	private String franchise;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
	
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", salary=" + salary + ", franchise=" + franchise + "]";
	}
	
	
	
	

}

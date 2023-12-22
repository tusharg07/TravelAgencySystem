package com.Sprinfboot.Project.tas.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Councillor {
	
	private int CounId;
	private String CounName;
	private String CounDesig;
	private String CounSalary;
	
	@Id
	public int getCounId() {
		return CounId;
	}
	public void setCounId(int counId) {
		CounId = counId;
	}
	public String getCounName() {
		return CounName;
	}
	public void setCounName(String counName) {
		CounName = counName;
	}
	public String getCounDesig() {
		return CounDesig;
	}
	public void setCounDesig(String counDesig) {
		CounDesig = counDesig;
	}
	public String getCounSalary() {
		return CounSalary;
	}
	public void setCounSalary(String counSalary) {
		CounSalary = counSalary;
	}
	
	@Override
	public String toString() {
		return "Councillor [CounId=" + CounId + ", CounName=" + CounName + ", CounDesig=" + CounDesig + ", CounSalary="
				+ CounSalary + "]";
	}
	
	
	
	

}

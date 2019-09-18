package com.manage;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int eno;//Primary key
	private String ename;
	private int sal;
	

	@OneToOne
	private laptop laptop;
	
	public Emp(int eno, String ename, int sal, com.manage.laptop laptop,
			List<Vehicle> vehicles, List<Project> project) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicles = vehicles;
		this.project = project;
	}

	public Emp(int eno) {
		super();
		this.eno = eno;
	}

	public laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(laptop laptop) {
		this.laptop = laptop;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@OneToMany(mappedBy = "emp")
	private List<Vehicle> vehicles;
			
	@ManyToMany
	private List<Project> project= new ArrayList<Project>();
	
	public int getEno() {
		return eno;
	}
	
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	public Emp(int eno, String ename, int sal, com.manage.laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}
	
	public String getEname() {

		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getSal() {
		return sal;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public Emp(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public Emp() {
		super();
	}
	
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal+ "]";
	}

	

}
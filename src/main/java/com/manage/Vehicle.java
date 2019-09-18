package com.manage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Vehicle {

	@Id
	private int regno;
	public Vehicle(int regno, String brand, String model, int price) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	private String brand;
	private String model;
	private int price;
	
	@ManyToOne
	private Emp emp;

	public Vehicle(int regno, String brand, String model, int price, Emp emp) {
		super();
		this.regno = regno;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.emp = emp;
	}



	public Vehicle() {
		super();
	}

	public Vehicle(int regno) {
		super();
		this.regno = regno;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	
}

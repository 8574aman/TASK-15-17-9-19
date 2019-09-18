package com.manage;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class laptop {

	@Id
	private String code;
	private String brand;
	private int price;
	
	@OneToOne(mappedBy="laptop")
	private Emp emp;
	
	
	public laptop(String code) {
		super();
		this.code = code;
	}
	public laptop() {
		super();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "laptop [code=" + code + ", brand=" + brand + ", price=" + price
				+ "]";
	}
	public laptop(String code, String brand, int price) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
	}
	
	
}

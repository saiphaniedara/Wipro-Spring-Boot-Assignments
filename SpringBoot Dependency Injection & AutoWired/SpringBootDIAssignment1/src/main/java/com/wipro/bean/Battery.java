package com.wipro.bean;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private int id;
	private String manufacturer;
	public Battery() {
		super();
		System.out.println("Battery Object Created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Battery Object";
	}
	
}

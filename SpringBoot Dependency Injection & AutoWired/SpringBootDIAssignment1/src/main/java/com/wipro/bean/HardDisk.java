package com.wipro.bean;

import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	private int id;
	private String brand;
	public HardDisk() {
		super();
		System.out.println("Hard Disk Object Created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "HardDisk Object";
	}
	
}

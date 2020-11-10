package com.wipro.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	HardDisk hd;
	@Autowired
	Battery battery;
	public Laptop() {
		super();
		System.out.println("Laptop Object Created");
	}
	public HardDisk getHd() {
		return hd;
	}
	public void setHd(HardDisk hd) {
		this.hd = hd;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Laptop Object";
	}
	
}

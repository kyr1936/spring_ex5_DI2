package com.yr.notebook;

import org.springframework.stereotype.Component;

@Component // new HardDisk();
public class HardDisk {

	private int size;
	private String brand;
	
	//생성자
	
	//메서드
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}

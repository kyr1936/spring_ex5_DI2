package com.yr.notebook;

import org.springframework.stereotype.Component;

@Component
public class Vga {

	private int size;
	private String company;
	
	public Vga(int size, String company) {
		this.size=size;
		this.company=company;
		
		// TODO Auto-generated constructor stub
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}

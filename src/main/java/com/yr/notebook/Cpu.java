package com.yr.notebook;

import org.springframework.stereotype.Component;

@Component   // new Cpu(); 변수들의 값은 null  servlet-context.xml
public class Cpu {
	private String core;
	private String company;
	
	// 생성자를 통해서만 값을 넣을 수 있음
	// getter만 있어도 되지만 수정은 setter를 통해
	public Cpu(String core, String company) {
		// TODO Auto-generated constructor stub
		this.core=core;
		this.company=company;
	}
	
	public Cpu() {
		// TODO Auto-generated constructor stub
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}

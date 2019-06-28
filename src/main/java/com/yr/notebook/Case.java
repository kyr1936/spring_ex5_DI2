package com.yr.notebook;

import org.springframework.stereotype.Component;

@Component
public class Case {
	private MainBoard mainBoard;

	public Case(MainBoard mainBoard) {
		this.mainBoard=mainBoard;
	}
	
	public MainBoard getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(MainBoard mainBoard) {
		this.mainBoard = mainBoard;
	}
	
	
}

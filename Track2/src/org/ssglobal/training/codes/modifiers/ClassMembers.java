package org.ssglobal.training.codes.modifiers;

public class ClassMembers {
	
	// static variables
	public static long id = 1L;
	double salary = 100.5;
	protected int key = 673272346;
	private char letter = 'v';
	
	// instance variable
	public int age = 10;
	
	//methods
	
	public void showData() {
		id = 2L;
		salary = 5000.5;
		key = 74639269;
		letter = 'h';
		
	}
	
	public void printData() {
		
	}
	
	protected void authenticate() {
		
	}
	
	private void encryoData() {
		
	}
	
	public void reference() {
		showData();
		printData();
		authenticate();
		encryoData();
	}

}

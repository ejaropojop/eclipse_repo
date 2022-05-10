package org.ssglobal.training.codes.modifiers;

public class TestClassMembers extends ClassMembers{

	public static void main(String[] args) {

		ClassMembers cm = new ClassMembers();
		id = 3L;
		cm.showData();
		
		cm.salary = 6000.0;
		cm.printData();
		cm.key = 31290841;
		cm.authenticate();
		char a = 064770;
		System.out.println(a);
		int[] b;
		

	}
	
	public void accessPoint() {
		key = 8000;
		authenticate();
		
	}

}

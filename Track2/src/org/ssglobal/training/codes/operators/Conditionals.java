package org.ssglobal.training.codes.operators;

public class Conditionals {
	
	public void createConditions() {
		
		float amount1 = 100.2F;
		float amount2 = 56.5F;
		boolean ce1 = amount1 == amount2;
		System.out.println(ce1);
		if (ce1) {
			
			System.out.println("amount1 is equal to amount2");
			
		} else {
			
			System.out.println("not equal");
		}
		
		char test1 = 'a';
		char test2 = 'b';
		boolean ce2 = test1 > test2; // test1 should comes last after test2
		System.out.println(ce2);
		if (ce2) {
			
			System.out.println("test1 comes last after test2");

		}else {
			System.out.println("test 1 comes first before test2");
		}
	}
	
	public void createComplexCondition() {
		
		byte data = 10;
		boolean le1 = data >= 50 & data <= 100; // Logical Expression 1
		
		if (le1) {
			System.out.println("within the rnage");
		} else {
			System.out.println("not in range");
		}
		
		// S - Sick Leave, V - Vacation Leave, X - No Leave
		char sickLeave = 'S';
		char withOT = 'N'; // Y = OT , N = No OT
		int approval = 0;
		boolean le2 = sickLeave == 'S' | withOT++ == 'Y' | approval++ < -1;
		System.out.println(withOT);
		System.out.println(approval);
		System.out.println(le2);
		
	}
	
	public void createTernary() {
		int choice = 25;
		// [0 - 10] -> RED
		// [10 - 20] -> BLUE
		// [20 - 30] -> GREEN
		
		String color = (choice >= 0 && choice <= 10)? "RED" : 
						(choice >= 10 && choice <= 20)? "BLUE" : 
						(choice >= 20 && choice <= 30)? "GREEN" : "COLORLESS";
		System.out.println(color);
		
	}
	
	public void appyShiftOps() {
		// << left shift operator
		
		int counter = 1;
		int se1 = counter << 2;
		
		// 1  = 1 * 2^0 = 0001;
		// 2  = 1 * 2^1 = 10010;
		// 4  = 1 * 2^2 = 0100;
		// 8  = 1 * 2^3 = 1000;
		// 16 = 1 * 2^4 = 1 0000;
		// 32 = 1 * 2^5 = 10 0000;
		
		System.out.println(se1);
		
		counter = se1;
		
		// >> right shift operator
		int se2 = counter >> 5;
		
		// 16 = 010000
		// 8 = 001000
		
		System.out.println(se2);
	}

	public float chooseTemperatureSwitch(int option) {
		
		float temperature = 0.0F;
		
		switch(option) {
			case 0:
				temperature = 50.0F;
				break;
			case 1:
				temperature = 60.0F;
				break;
			case 2:
				temperature = 70.0F;
				break;
			case 3:
				temperature = 80.0F;
				break;
		}
		
		return temperature;
		
	}
}

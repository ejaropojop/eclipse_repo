package org.ssglobal.training.codes.referenceVariables;

public class PassingVariables {

	public void passingPrimitive(int number) {
		
		number = 100;
		System.out.format("The new number is %d \n", number);
		
	}
	
	public void passingRefVar(StringBuilder sb) {
		
		sb.append(" in the Philippines");
		System.out.format("The new sb is %s. \n", sb.toString());
	}
	
	public void passingStrVal(String str) {
		str = "Pasig";
		System.out.format("The new str is %s. \n", str.toString());
	
	}
}

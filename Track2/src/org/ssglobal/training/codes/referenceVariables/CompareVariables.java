package org.ssglobal.training.codes.referenceVariables;

public class CompareVariables {
	
	public void comparePrimitive() {
		int x1 = 10;
		int x2 = 20;
		
		System.out.println(x1 == x2);
		
	}
	
	public void compareRefVar() {
		
		StringBuilder sb1 = new StringBuilder("Manila");
		StringBuilder sb2 = new StringBuilder("Manila");
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb1 == sb2);
		
	}
	
	public void compareStrVar() {
		
		String sb1 = "Manila";
		String sb2 = "Manila";
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1 == sb2);
		
	}

}

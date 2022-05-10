package org.ssglobal.training.codes.referenceVariables;

public class TestPassingVariables {

	public static void main(String[] args) {

		PassingVariables pv = new PassingVariables();
		
		//Primitive Variable
		int testX = 10;
		System.out.format("This is the original num: %d. \n", testX);
		pv.passingPrimitive(testX);
		System.out.format("The new num is: %d. \n", testX);
		
		
		//Reference Variable
		StringBuilder testSb = new StringBuilder("Manila"); // testSb passed address of "Manila"
		System.out.format("This is the original sb is %s. \n", testSb);
		pv.passingRefVar(testSb);//accessed ("Manila") from testSb and get the sb value
		System.out.format("This is the new sb is %s. \n", testSb); //testSb values has been changed by sb
		
		String testStr = new String("Manila");
		System.out.format("This is the original sb is %s. \n", testStr);
		pv.passingStrVal(testStr); // no passing of address
		System.out.format("This is the new sb is %s. \n", testStr);
		
	}

}
 
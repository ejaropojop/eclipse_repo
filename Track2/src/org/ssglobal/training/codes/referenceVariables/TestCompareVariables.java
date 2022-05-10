package org.ssglobal.training.codes.referenceVariables;

public class TestCompareVariables {

	public static void main(String[] args) {

		CompareVariables cv = new CompareVariables();
		
		cv.comparePrimitive();
		cv.compareRefVar(); // different address
		cv.compareStrVar();

	}

}

package org.ssglobal.training.codes.declaration;

public class NumDiff {

	public int calculateNumDiff(int x) {
		
		int numDiff = calculateCube(x) - calculateSquare(x);
		return numDiff;
		
	}
	
	public int calculateCube(int x) {
		
		int square = x * x * x;
		return square;
		
	}
	
	public int calculateSquare(final int x) {
		
		int cube = x * x;
		return cube;
		
	}
	
}
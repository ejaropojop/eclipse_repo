package org.ssglobal.training.codes.operators;

public class MathOps {
	
	public int divide(final int x, final int y) {
		
		return x / y; // integer division operator

	}
	
	public int calcRemainder(final int x, final int y) {
		
		return x % y; // modulo
		
	}

	public double divideNumCast(final int x, final int y) { // Casting to convert int to double
		
		double xdbl = (double) x;
		double ydbl = (double) y;
		
		return xdbl / ydbl;
	}
	
	public double divideNumParams(final double x, final double y) { // Parameter changing data type to convert int to double
		
		return x / y;
	}
	
	public double divideNumConvert(final int x, final int y) {
		
		double q = 1.0 * x /y;
		return q;
	}
}

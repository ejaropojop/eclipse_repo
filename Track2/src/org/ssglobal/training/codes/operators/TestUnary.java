package org.ssglobal.training.codes.operators;

public class TestUnary {

	public static void main(String[] args) {

		Unary unary = new Unary();
		System.out.println("----------POST INCREMENT---------");
		System.out.println("LOOP WITHOUT VAR POST");
		//unary.loopWithoutCounterVarPost();
		System.out.println("--------------------------");
		//System.out.println("LOOP WITH VAR POST");
		unary.loopWithCounterVarPost();

		System.out.println("----------PRE INCREMENT---------");
		System.out.println("LOOP WITHOUT VAR POST");
		//unary.loopWithoutCounterVarPre();
		unary.loopWithCounterVarPre();
	}

}

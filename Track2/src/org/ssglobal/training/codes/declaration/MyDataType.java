package org.ssglobal.training.codes.declaration;

public class MyDataType {
	
	//global variables
	public byte counter;
	public short numProduct;
	public int numCells;
	public long numTcells = 20000L;
	
	public float weight = 0.05F;
	public double billGatesMoney = 0.05;
	
	public void createVars() {
		
		int age;
		float salary;
		
	}
}	

class TestMyData {

	public static void main(String[] args) {
		//instantiation
		MyDataType mdt = new MyDataType();
		System.out.println(mdt.billGatesMoney);

	}
	
}

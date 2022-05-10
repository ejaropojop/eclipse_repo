package org.ssglobal.training.codes.referenceVariables;

public class VarArg {
	
	public void printNums(int... nums) {
		
		//Calling 1 by 1
		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		//System.out.println(nums[3]);
		
		//forEach
		//print how many input there is
		for (int lookup: nums) {
			System.out.println(lookup);
		}
	}

}

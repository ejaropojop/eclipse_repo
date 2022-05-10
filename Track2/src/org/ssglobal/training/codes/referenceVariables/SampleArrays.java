package org.ssglobal.training.codes.referenceVariables;

public class SampleArrays {

	public void createSingleArray() {
		
		char[] letters = new char[5]; //fixed length
		System.out.println(letters[0]); // \0
		letters[0] = 64;
		letters[1] = 'a';
		letters[2] = '\u20B1';
		letters[3] = 'C';
		letters[4] = '\t';
		
		String names[] = new String[10]; // array of objects / no constructor
		names[names.length-1] = "ABBA"; //last cell
		int lenArray = letters.length; // constant value
		System.out.println(names[0]); //null
	
		
		//initialization of array
		double[] grades = new double[] {78.5, 90.0, 86.5};
		System.out.println(grades[0]);
		//latest initialization
		double[] ages = { 24, 20, 30};
		System.out.println(ages[0]);
		
		//reinstantiate to change array length
		grades = null;
		grades = new double[] {66.5, 89.7, 90, 45.7};
		System.out.println(grades[0]);
		System.out.println(" ");
		
	}
	
	public void createMatrix() {
		
		int[][] matrix = new int[3][3];
		
		//row 1
		matrix [0][0] = 2;
		matrix [0][1] = 5;
		matrix [0][2] = 10;
		
		// row 2
		matrix [1][0] = 1;
		matrix [1][1] = 1;
		matrix [1][2] = 1;
		
		// row 3
		matrix [2][0] = 2;
		matrix [2][1] = 2;
		matrix [2][2] = 2;
											
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
			
		}

		
		double[][] prices = new double[][] {{2.2, 3.3, 4.5},
											{8.9, 4.5, 1.1},
											{3.4, 6.6, 4.5}
											};
											
		System.out.println(" ");
		
		for (double[] rowLookup: prices) {
			for (double columnLookup : rowLookup) {
				System.out.print(columnLookup + " ");
			}
			System.out.println(" ");
			
		}
	}
	
}

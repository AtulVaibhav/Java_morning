package com.multidimensionalArray;

public class Test {

	public static void main(String[] args) {
	  //data_type [][] name = {{},{},{}};
		int[][] ar = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        
		int[][] ar2 = new int[3][4];
		
		//Accessing:
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}

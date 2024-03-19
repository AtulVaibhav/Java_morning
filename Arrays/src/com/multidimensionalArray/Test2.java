package com.multidimensionalArray;

public class Test2 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{11},{21,22}};
		
		for(int[] a:arr){
			for(int data:a){
				System.out.print(data+" ");
			}
			System.out.println();
		}

	}

}

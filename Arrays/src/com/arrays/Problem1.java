package com.arrays;

public class Problem1 {
   public static void secondLargestElement(int[] arr){
	  int largestElement = 0;
	  for(int i=0;i<arr.length;i++){
		  if(arr[i]>largestElement){
			  largestElement = arr[i];
		  }
	  }
	 int secondLargest = arr[0];
	 for(int i=1;i<arr.length;i++){
		 if(arr[i]>secondLargest && arr[i]<largestElement){
			 secondLargest = arr[i];
		 }
	 }
	 System.out.println(secondLargest);
   }
	public static void main(String[] args) {
		int[] arr={1,10,3,7,5,11,13,2,13};
        secondLargestElement(arr);
	}

}

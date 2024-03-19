package com.arrays;

class Arrays{
	 int[] arr;
	Arrays(int size){
		this.arr = new int[size];
		for(int i=0;i<size;i++){
			this.arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void insertElements(int position,int element){
		if(this.arr[position]==Integer.MIN_VALUE){
			arr[position] = element;
		}else{
			System.out.println("Can't insert element at position :"+position);
		}
	}
	
	
	public void readAll(){
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		System.out.println(java.util.Arrays.toString(arr));
		
		//enhanced for loop
//		for(int data:arr){
//			System.out.print(data+" ");
//		}
//		System.out.println();
			
	}
	
	public void readByIndex(int index){
		if(this.arr[index]==Integer.MIN_VALUE){
			System.out.println("No element is present at given position :"+index);
		}else{
			System.out.println(this.arr[index]);
		}
	}
	
	public void updateElement(int index,int updatedElement){
		if(this.arr[index]==Integer.MIN_VALUE){
			System.out.println("Updation not allowed at position :"+index);
			//this.insertElements(index, updatedElement);
		}else{
			this.arr[index]= updatedElement;
			System.out.println("Updated successfully");
		}
	}
	
	public void deleteElement(int index){
		if(this.arr[index]==Integer.MIN_VALUE){
			System.out.println("Deletion can't be performed at index:"+index);
		}else{
			this.arr[index] = Integer.MIN_VALUE;
			System.out.println("Deleted successfully");
		}
	}
	
}


public class Test {

	public static void main(String[] args) {
		Arrays obj = new Arrays(5);
		//obj.readAll();
		obj.insertElements(1, 25);
		obj.readAll();
//		obj.insertElements(1, 32);
//		
//		obj.readByIndex(1);
//		obj.readByIndex(2);
//		
//		obj.updateElement(2, 100);
//		obj.updateElement(1, 100);
//		
//		obj.readAll();
//		
//		obj.deleteElement(2);
//		obj.deleteElement(1);
//		obj.readAll();

	}

}

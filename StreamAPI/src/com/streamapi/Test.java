package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class MaxNumber implements Comparator<Integer>{

	@Override
	public int compare(Integer firstValue, Integer secondValue) {
		return firstValue - secondValue;
	}
	
}

class MinNumber implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		int min = o1;
		if(o1>o2){
			min = o2;
		}
		return min;
	}
	
}
public class Test {

	public static void main(String[] args) {
		//Intermediate operation:
		//filter(),map(),flatmap(),distinct(),sorted(),limit(),skip()
		
		//Terminal Operation:
		//forEach(),collect(),reduce(),min(),max(),count(),anyMatch(),allMatch(),findFirst(),findAny()

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.stream().filter(x->x%2==0).forEach(System.out::println);
		
		System.out.println("________________________________");
	List<Integer> oddSquareNumber = list.stream()
			                      .filter(x->x%2==1)
			                      .map(x->x*x)
			                      .collect(Collectors.toList());
	System.out.println(oddSquareNumber);
	
	System.out.println("____________________________________");
	
	List<List<Integer>> newList = Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(11,12,13));
	System.out.println(newList);
	
	List<Integer> list2 = newList.stream()
			             .flatMap(list1->list1.stream())
			      
	                     .collect(Collectors.toList());
	System.out.println(list2);
	
	System.out.println("_________________________________________");
	List<Integer> l1 = Arrays.asList(1,2,1,2,2,2,2,3,4,5,7,9);
	System.out.println(l1.stream().distinct().collect(Collectors.toList()));
	System.out.println(l1.stream().distinct().count());
	System.out.println(l1.stream().distinct().max(new MaxNumber()).get());
	//System.out.println(l1.stream().distinct().min(new MinNumber()).get());
	
	
	System.out.println("____________________________________________");
	List<String> str = Arrays.asList("Avinash","Vivek","Amit","Arjun","Vinod");
	System.out.println(str.stream().anyMatch(x->x.startsWith("A")));
	System.out.println(str.stream().filter(x->x.startsWith("Am")).findFirst().get());
	System.out.println(str.stream().allMatch(x->x.startsWith("A")));
	System.out.println(str.stream().filter(x->x.startsWith("A")).collect(Collectors.toList()));
	
	System.out.println("__________________________________________________");
	List<Integer> l2 = Arrays.asList(1,2,3,4,5);
	int result = l2.stream().reduce(1,(sum,a)->sum+a);
	System.out.println(result);
	
	
	}

}

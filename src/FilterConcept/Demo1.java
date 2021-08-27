package FilterConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		// to identify the even number form a list and move it to another list
		
		List<Integer> numList = new ArrayList<Integer>();
		List<Integer> evnList = new ArrayList<Integer>();

		numList.add(5);
		numList.add(10);
		numList.add(15);
		numList.add(20);
		numList.add(25);
		
//		System.out.println(numList.get(0));
//		System.out.println(numList.get(4));
//		System.out.println(numList.size());
//		
//		System.out.println(numList);
//		
//	
//		for(int n : numList) {
//			
//			if(n%2==0) {
//				evnList.add(n);
//			}
//		}

		System.out.println(numList);
		
		// with streams
		
//		evnList = numList.stream().filter(n->n%2==0).collect(Collectors.toList());
//		System.out.println(evnList);
		
		numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

		
		
	}
	
	
	

}

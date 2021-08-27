package LamdaConcepts;

import java.util.function.Predicate;

public class PredicateConcepts {

	public static void main(String[] args) {

		//ex.1: to check the number is greater than another one
		
		
		Predicate<Integer> p = i->(i>20);
		
		System.out.println(p.test(10));
		
		
		//ex.2: to check the length of given string is >4 or not
		
		Predicate<String> sp = s->(s.length()>4);
		
		
		boolean b = sp.test("welcome");
		System.out.println(b);
		
		
//		String ptr = "Purushottam";
//		
//		if (ptr.length()>4) {
//			System.out.println("String is greater than 4 letter");
//		}
		
		
		
		
	}

}

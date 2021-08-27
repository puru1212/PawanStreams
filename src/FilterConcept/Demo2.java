package FilterConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {

		
		// to identify the names from  the list which is less than 8 and greater than 6 
		
		List<String> names = Arrays.asList("purushottam", "monika", "priya", "deepak", "mohan", "suman");
		
		List<String> longNames = new ArrayList<String> ();
		
		
		longNames = names.stream().filter(n->n.length()>5 && n.length()<7).collect(Collectors.toList());
		
		
		System.out.println(names);
		System.out.println(longNames);
		
		
				
		
		
		
	}

}

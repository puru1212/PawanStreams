package FilterConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String arug[]) {
		
		
		// to remove the null keys from one list and store it in another list.

		List<String> bookList = Arrays.asList("physics", "chemistry", "biology", null, "maths", null, "history", null, "english");
		
		
		
		List<String> books = bookList.stream().filter(w->w!=null).collect(Collectors.toList());
		System.out.println(bookList);
		System.out.println(books);
		
 		
		
		
		
		
		
	}
}
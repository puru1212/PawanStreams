package FilterConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class product{
	
	public product(int id, String name, double price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}
	int id;
	String name;
	double price;
}





public class Demo4 {

	public static void main(String[] args) {
		

		
		List <product> productList = new ArrayList <product> ();
		
		productList.add(new product(1, "HP Laptop", 75000));
		productList.add(new product(2, "Lenovo Laptop", 500000));
		productList.add(new product(3, "Sony Laptop", 40000));
		productList.add(new product(4, "Asus Laptop", 70000));
		productList.add(new product(5, "Apple Laptop", 80000));
		
		
		productList.stream().filter(p->p.price>40000).forEach(p->System.out.println(p.name));
		
	
		
		
		
		
		
		
		
		
	}

}

package tester;
import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;;
public class Test1 {

	public static void main(String[] args) {
		List<Product> products = populateData();
		//diplay products as per ascending order of price
		//Approach 1 -> Declarative style
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return ((Double)p1.getPrice()).compareTo(p2.getPrice());
			}
		});
		for(Product p : products) {
			System.out.println(p);
		}
		System.out.println("------------------------");
		//Approach 2 -> Functional Programming ->lamda style
		//Collections.sort(products, (product1,prodcut2)->((Double)product1.getPrice()).compareTo(prodcut2.getPrice()));
		Collections.sort(products, (Product1 ,Product2)-> ((Double)Product1.getPrice()).compareTo(Product2.getPrice()));
        products.forEach(p->System.out.println(p));
	
	   System.out.println("-----------------------------");
	   //Approach 3 -> Functional Programming -> stream & lamda style
	   products.stream().sorted((Product1,Product2)->((Double)Product1.getPrice()).
			   compareTo(Product2.getPrice())).forEach(p->System.out.println(p));
	   System.out.println("-----------------------------");
	   //Approach 4 ->  Functional Programming -> stream & lamda style and method reference
	   products.stream().sorted((Product1,Product2)->((Double)Product1.getPrice()).
			   compareTo(Product2.getPrice())).forEach(System.out::println);
	
	}
	

}

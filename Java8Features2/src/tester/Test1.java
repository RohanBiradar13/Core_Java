package tester;
import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.function.Consumer;

import com.app.core.Product;

public class Test1 {

	public static void main(String[] args) {
		List<Product> products=populateData();
		//display all product details : lamda expr
		products.forEach(p-> System.out.println(p));
		//apply discount(reduce prices of all products by 50) : lamda expr
		System.out.println("-----------");
		products.forEach(p-> p.setPrice(p.getPrice()-50));
		//display all product details again : lamda exper
		products.forEach((p)-> System.out.println(p));
		System.out.println("-----------");
	for(Product p : products) {
		p.setPrice(p.getPrice()-50);
		System.out.println(p);
	}
	System.out.println("-----------");
	//how it is forEach is working 
	products.forEach(new Consumer<Product>() {

		@Override
		public void accept(Product t) {
			System.out.println(t);
			
		}
		
	});
	}

}

package tester;

import static utils.CollectionUtils.populateData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Product;

public class Test5 {

	public static void main(String[] args) {
		// display only product details, sorted in ascending order as per product price
		// By tradional way
		List<Product> products = populateData();
		products.forEach(p -> System.out.println(p));
		Collections.sort(products, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {

				return ((Double) o1.getPrice()).compareTo(o2.getPrice());
			}

		});
		System.out.println("----------------");
		
		// By Functional Programming
		// SAM : public int compare(T o1, T o2)
        Collections.sort(products, (product1,prodcut2)->((Double)product1.getPrice()).compareTo(prodcut2.getPrice()));
        products.forEach(p->System.out.println(p));
	}

}

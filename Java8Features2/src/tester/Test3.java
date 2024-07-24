package tester;

import static utils.CollectionUtils.populateData;

import java.util.Iterator;
import java.util.List;

import com.app.core.Category;
import com.app.core.Product;
import static com.app.core.Category.valueOf;

public class Test3 {

	public static void main(String[] args) {
		List<Product> products=populateData();
		//display all product details : lamda expr
		products.forEach(p-> System.out.println(p));
		//remove all products of category "Fruit"
		//this is by old tradional style
		Category c = valueOf("FRUITS");
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			
			if(itr.next().getProductCategory().equals(c)) {
				itr.remove();
			}
		}
		System.out.println("----------");
		for(Product p : products) {
			System.out.println(p);
		}
		System.out.println("-------------");
products.removeIf(p->p.getProductCategory().equals(valueOf("OIL")));
products.forEach(p-> System.out.println(p));
	}

}

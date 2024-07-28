package tester;
import static utils.CollectionUtils.populateData;

import java.util.List;

import com.app.core.Product;
public class Test2 {

	public static void main(String[] args) {
		List<Product> products = populateData();
		//display products as per manufactureDate
		products.stream().sorted((Product1,Product2)->Product1.getManufactureDate().
				compareTo(Product2.getManufactureDate())).forEach(System.out::println);;

	}

}

package utils;

import static com.app.core.Category.FRUITS;
import static com.app.core.Category.GRAINS;
import static com.app.core.Category.OIL;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Product;

public interface CollectionUtils {
//public 
	 static List<Product> populateData(){
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(100, "mango", FRUITS, parse("2024-01-01"), 500));
		products.add(new Product(12, "sunflower", OIL, parse("2024-12-12"), 400));
		products.add(new Product(120, "rice", GRAINS, parse("2024-06-07"), 530));
		products.add(new Product(13, "wheat", GRAINS, parse("2024-02-01"), 200));
	return products;
	}
	 //add a static method : which will copy refs from the List--->Map
	 static Map<Integer,Product> populateMapFromList(List<Product>list){
		 Map<Integer,Product>productMap =  new HashMap<>();
		 for(Product p : list) {
			 productMap.put(p.getId(), p);
		 }
		 return productMap;
	 }
}

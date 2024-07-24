package tester;
import static utils.CollectionUtils.populateData;
import static utils.CollectionUtils.populateMapFromList;

import java.util.Map;
import java.util.TreeMap;

import com.app.core.Product;
public class Test4 {

	public static void main(String[] args) {
		//get populated map of products
		Map<Integer, Product> products = populateMapFromList(populateData());
		/*This is tradional way
		 * for(Product p : products.values()) { System.out.println(p); }
		 */
        //This is declarative way : Functional Programming
		//without converting to collection for display
		//public default forEach(BiConsumer<? super k,?super V> consumer)
		//SAM : public void accept(K k, V v)
		products.forEach((i,p)-> System.out.println(p));
		System.out.println("----------------");
		//display only product details, sorted in ascending order as per product ids
		 TreeMap<Integer,Product> prodcuts = new TreeMap<Integer, Product>(products);
		 prodcuts.forEach((i,p)->System.out.println(p));
		
	}

}

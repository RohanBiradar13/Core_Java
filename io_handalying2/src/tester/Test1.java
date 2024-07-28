package tester;
import static utils.CollectionUtils.populateData;
import static com.app.core.Category.valueOf;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the file name");
			PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()));
		List<Product> products	= populateData();
		System.out.println("Enter the category name(Objects) which you want to print in the file");
		Category category = valueOf(sc.next().toUpperCase());
		products.stream().filter(c->c.getProductCategory().equals(category)).
		//sorted(Comparator.comparing(p->p.getPrice())).
		sorted(Comparator.comparing(Product::getPrice)).
		forEach(pw::println);
		pw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}

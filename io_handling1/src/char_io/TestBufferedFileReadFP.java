package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufferedFileReadFP {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name");
			BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
			/*
			 * String line = null; while ((line = br.readLine()) != null) {
			 * System.out.println(line); }
			 */
			//br.lines().forEach(p->System.out.println(p));by functional programming
			br.lines().forEach(System.out::println);//by functional programming and method reference
			System.out.println("File read over...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}

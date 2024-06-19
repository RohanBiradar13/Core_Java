package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
	   System.out.println("enter the length of an array");
	   Scanner sc = new Scanner(System.in);
	   double data[] = new double[sc.nextInt()];
	   System.out.println("default values using for loop");
	   for(int i=0; i<data.length;i++) {
		   System.out.print(data[i] + " ");
	   }
	   System.out.println();
	   System.out.println("default values using for loop");
	   for(double d: data) {
		   System.out.print(d + " ");
	   }
	   System.out.println();
	   System.out.println("enter the data");
	  //accept the length from user and also the data and display it
	   for(int i=0; i<data.length;i++) {
		   data[i]=sc.nextDouble();
	   }
	   System.out.println("Data in for loop");
	   for(int i=0; i<data.length;i++) {
		   System.out.print(data[i] + " ");
	   }
	   
	
	  System.out.println();
	  System.out.println("Data is in for each loop");
	   for(double d: data) {
		   System.out.print(d + " ");
	   }
	   //we can directly display the data in the array by importing arrays class 
	   //it has in-built method toString to display the contents
	   System.out.println();
	   System.out.println("Array contents" + Arrays.toString(data));
	   System.out.println("Array classname" + data.getClass().getName());
	   byte [][] bytes=new byte[4][5];
	   System.out.println("Array classname" + bytes.getClass().getName());
	   sc.close();
   }
}

package tetser;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter registrationnumber, colour, price");
Vehicle v1 = new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
System.out.println("Enter registrationnumber, colour, price");
Vehicle v2= new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());
if(v1.checkEquals(v2)) {
	System.out.println("Same Vehicle Ragistration number");
}else {
	System.out.println("Different Vehicle Ragistration number");
}
if(v1.equals(v2)) {
	System.out.println("Same Vehicle Ragistration number");
}else {
	System.out.println("Different Vehicle Ragistration number");
}
String s = new String("Hi");
if(v1.equals(s)) {
	System.out.println("Same Vehicle Ragistration number");
}else {
	System.out.println("Different Vehicle Ragistration number");
}
}
}
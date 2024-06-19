package tester;

import java.util.Scanner;
import static utils.ValidationRules.*;

import com.app.core.Vehicle;

import customExcepton.VehicleHandlingException;

public class VehicleShowroom {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter capacity of the showroom: ");
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			int counter=0;
			boolean exit = false;
			while (!exit) {
				System.out
						.println("1.Add Vehicle to showrrom only if it's not duplicate 2.Display all vehicles 3.exit");
			try {
				switch (sc.nextInt()) {
			
				case 1:
					if(counter < vehicles.length) {
					System.out.println("Enter vechile details: registration number, colour, price");
				    int regsno=sc.nextInt();
				    String colour=sc.next();
				    double price=sc.nextDouble();
				    checkForDuplicates(vehicles, regsno, colour);
				    vehicles[counter++]=new Vehicle(regsno, colour,price);
				    System.out.println("Vehicle details added successfully");}
					else {
						throw new VehicleHandlingException("Showroom Full...");
					}

				
				break;

				case 2:
					for(Vehicle v: vehicles) {
						if(v!=null) {
						System.out.println(v);
					}
					}

					break;
				case 3:
					exit = true;

					break;

				}
			
			
			
			}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over");
	}

}
	}
}

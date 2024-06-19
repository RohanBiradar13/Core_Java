package tester;



import java.util.Scanner;

import com.app.core.Vehicle;

import customException.VehicleHandlingException;

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
				   Vehicle v =checkForDuplicate(vehicles, sc.nextInt(), sc.next(),sc.nextDouble(),sc.next());
				    
				    vehicles[counter++]=v;
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

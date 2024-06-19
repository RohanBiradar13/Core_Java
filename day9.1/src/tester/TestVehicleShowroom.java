package tester;

import java.util.Scanner;
import static utils.ValidationRules.*;
import com.app.core.Vehicle;

import customException.VehicleHandalingException;

public class TestVehicleShowroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the lenght of the showrrom");
			Vehicle[] vehicles=new Vehicle[sc.nextInt()];
			int counter=0;
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add Vehicle to showroom 2.Display all Vehicles in showrrom 3.Exit");
				try {
				switch (sc.nextInt()) {
				case 1:
					if(counter<vehicles.length) {
					 System.out.println("Enter details registrationNumber, colour,"
					+ " price, manufactureDate, type");
                      Vehicle v = chechForDuplicate(vehicles, sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
                      vehicles[counter++] = v;}
                      else {
                    	  throw new VehicleHandalingException("Showroom is full...");
                      }
					break;

				case 2:
            for(Vehicle v1: vehicles) {
            	System.out.println(v1);
            }
					break;
				case 3:
					exit=true;

					break;

				
				}
				}catch (Exception e) {
				e.printStackTrace();
			}
			
		
				}
	}
		}
}
		

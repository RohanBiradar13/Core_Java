package tester;

import java.util.Scanner;

import com.code.Vehicle;
import static Validation.ValidationRules.checkForDup;

import CustomException.VehicleHandlingException;

public class TestVehicle {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		Vehicle[] vehicles = new Vehicle[100];
		boolean exit = false;
		int counter = 0;
		while(!exit) {
			System.out.println("Options 1.Add Vehicle 2.Display 3. Exit");
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Enter Vehicle details : chasisno,color,price");
			if(counter < vehicles.length) {
				String chasisNo = sc.next();
				String color = sc.next();
				double price = sc.nextDouble();
				checkForDup(vehicles, chasisNo);
				vehicles[counter++] = new Vehicle(chasisNo,color,price);
				System.out.println("Vehicle added successfully");
			}
			else {
				throw new VehicleHandlingException("Showroom full!!!!");
			}
			break;
		case 2:
			System.out.println("Showroom Details");
			for(Vehicle v : vehicles) {
				if(v != null) {
					System.out.println(v);
				}
			}
			break;
		case 3 :
			exit = true;
			break;
		}
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

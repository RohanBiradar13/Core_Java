package tester;

import static utils.ValidationRules.checkDate;
import static utils.ValidationRules.checkForDuplicate;
import static utils.ValidationRules.checkVehicleType;
import static utils.ValidationRules.readData;
import static utils.ValidationRules.writeData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Vehicle;

public class VehicleManagementSystem {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the File Name");
			String fileName = sc.next();
			List<Vehicle> vehicles = readData(fileName);
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add a vehicle to showroom");
				System.out.println("2.Remove a vehicle from showroom by chahis no");
				System.out.println("3.Update a vehicle by it's chahis no");
				System.out.println("4.Get a vehicle details by chahisNO from showroom");
				System.out.println("5.Display all vehicles in showroom");
				System.out.println("6.Exit");
				System.out.println("7.Sort the vehicles by chasisNO ");
				System.out.println("8.Sort the vehicles by manufactuing date");
				System.out.println("9.Get Vehicles which are from the company Honda");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter the Vehicle details chasisNo, colour, manufactureDate, type, companyName");
						// String chasisNo, String colour, LocalDate manufactureDate, VehicleType type,
						// String companyName)
						vehicles.add(new Vehicle(checkForDuplicate(vehicles, sc.next()), sc.next(),
								checkDate(sc.next()), checkVehicleType(sc.next()), sc.next()));
						System.out.println("Vehicle added successfully!!!");
						break;

					case 2:
						String chasisNo = sc.next();
						int index = vehicles.indexOf(new Vehicle(chasisNo));
						System.out.println("Vehicle remoeved successfully!!!");
						System.out.println(vehicles.remove(index));
						break;
					case 3:
						System.out.println("Enter the chahis no");
						String chasisNo1 = sc.next();
						System.out.println("Enter the new chahis no you want to update");
						String newChasisNo = sc.next();
						index = vehicles.indexOf(new Vehicle(chasisNo1));
						if (index == -1)
							System.out.println("Vehicle not found...");
						Vehicle v1 = vehicles.get(index);
						v1.setChasisNo(newChasisNo);
						System.out.println("Vehicle details updated successfully!!!");
						System.out.println(v1);
						break;
					case 4:
						System.out.println("Enter the chasis no");

						index = vehicles.indexOf(new Vehicle(sc.next()));
						if (index == -1)
							System.out.println("Vehicle not found...");
						break;
					case 5:
						vehicles.forEach(System.out::println);
						break;
					case 6:
						exit = true;
						
						writeData(vehicles, fileName);
						System.out.println("Data is saved in file");
						
						break;
					case 7:
						System.out.println("Vehicles sorted as per chasisNo");
						Collections.sort(vehicles);
						break;
					case 8:
						System.out.println("Vehicles sorted as per manufacturing date");
						/*
						 * Collections.sort(vehicles, new Comparator<Vehicle>() {
						 * 
						 * @Override public int compare(Vehicle o1, Vehicle o2) { return
						 * o1.getManufactureDate().compareTo(o2.getManufactureDate()); } });
						 */
						
						//below code by using functional programming
						// Collections.sort(vehicles, (vehicle1, vehicle2) -> vehicle1.getManufactureDate().compareTo(vehicle2.getManufactureDate()));
					   //below code by using comparator comparing method
						Collections.sort(vehicles, Comparator.comparing(Vehicle::getManufactureDate));

						break;
					case 9:
						//find a specific comapnay name if you want to get the vehicles which are only from Honda company
						//then how would you do that
						vehicles.stream().filter(v7 -> v7.getCompanyName().equals("Honda")).forEach(System.out::println);
						//vehicles.stream().filter();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}
}

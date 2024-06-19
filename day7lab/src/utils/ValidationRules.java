package utils;

import com.app.core.Vehicle;

import customExcepton.VehicleHandlingException;

public class ValidationRules {

	public static void checkForDuplicates(Vehicle vehicleDetails[], int registno, String colour)
			throws VehicleHandlingException {
		Vehicle newVehicle = new Vehicle(registno, colour);
		for (Vehicle v : vehicleDetails) {
			if (v != null) {
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Duplicate Vehicle Detected...");

				System.out.println("No duplicate vehicle...");

			}

		}

	}
}

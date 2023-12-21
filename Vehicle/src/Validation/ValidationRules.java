package Validation;

import com.code.Vehicle;

import CustomException.VehicleHandlingException;

public class ValidationRules {
public static void checkForDup(Vehicle[] vehicleData,String chasisNo) throws VehicleHandlingException {
	Vehicle v1 = new Vehicle(chasisNo);
	for(Vehicle v : vehicleData) {
		if(v != null) {
			if(v.equals(v1)) {
				throw new VehicleHandlingException("Duplicate Vehicle Detected!!");
			}
			
		}
	}
	System.out.println("No duplicate detected..");
}
}

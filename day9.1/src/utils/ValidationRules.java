package utils;

import java.text.ParseException;
import java.util.Date;
import static com.app.core.Vehicle.sdf;
import com.app.core.Vehicle;
import com.app.core.VehicleType;

import customException.VehicleHandalingException;

public class ValidationRules {
 public static Vehicle chechForDuplicate(Vehicle[] vehicles,int registrationNumber, String colour, double price, 
		 String manufactureDate, String type) throws VehicleHandalingException,ParseException {
	 Vehicle newVehicle = new Vehicle(registrationNumber, colour, price, 
			 sdf.parse(manufactureDate), VehicleType.valueOf(type.toUpperCase()));
	 for(Vehicle v: vehicles) {
		 if(v!=null) {
			 if(v.equals(newVehicle)) {
			 throw new VehicleHandalingException("Duplicate Vehicle Detected");
		 }
		 }else {
			 System.out.println("No Duplicate Vehicle ");
		 }
	 } return newVehicle;
 }
}

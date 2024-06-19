package utils;



import customException.VehicleHandlingException;

import static com.app.core.Vehicle.sdf;

import java.text.ParseException;

import com.app.core.Vehicle;
public class ValidationRules {
public Vehicle checkForDuplicate(Vehicle[]v,int resgNo,String colour,double price,String manuFactureDate)
		throws VehicleHandlingException,ParseException {
	if(v!=null) 
   Vehicle newVehicle = new Vehicle(resgNo, colour, price, sdf.parse(manuFactureDate));
		for(Vehicle v1: v) 
			if(v1.equals(newVehicle)) 
				throw new VehicleHandlingException("Duplicate Vehicle Detected");
			else 
				System.out.println("No Duplicate Vehicle ");
			
			return newVehicle;
		
		
	
	
	
}
}

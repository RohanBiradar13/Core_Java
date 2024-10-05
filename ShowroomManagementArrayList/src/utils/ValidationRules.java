package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.app.core.Vehicle;
import com.app.core.VehicleType;
import static utils.CollectionUtils.populatedList;
import customException.VehicleHandalingException;

public interface ValidationRules {
	public static final LocalDate thresholdDate = LocalDate.parse("2020-01-01");

	@SuppressWarnings("resource")
	public static void writeData(List<Vehicle> vehicles, String fileName) throws FileNotFoundException, IOException {
		@SuppressWarnings({ "resource", "resource" })
		ObjectOutputStream objStream = new ObjectOutputStream(new FileOutputStream(fileName));
		objStream.writeObject(vehicles);

	}

	@SuppressWarnings("unchecked")
	public static List<Vehicle> readData(String fileName)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
			ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream(fileName));
			return (List<Vehicle>) objInStream.readObject();
		} catch (Exception e) {
			return populatedList();
		}

		/*
		 * List<Vehicle> v1 = (List<Vehicle>) objInStream.readObject(); for (Vehicle v3
		 * : v1) System.out.println(v3);
		 */

	}

	public static String checkForDuplicate(List<Vehicle> vehicles, String chahisNo) throws VehicleHandalingException {
		Vehicle v = new Vehicle(chahisNo);
		for (Vehicle v1 : vehicles) {
			if (v1 != null && v1.equals(v))
				throw new VehicleHandalingException("Duplicate Vehicle Detected!!!");
		}
		System.out.println("No Duplicate Vehicle Detected!!!");
		return chahisNo;

	}

	public static VehicleType checkVehicleType(String type) throws VehicleHandalingException {
		try {
			VehicleType t1 = VehicleType.valueOf(type.toUpperCase());
			return t1;
		} catch (Exception e) {
			e.printStackTrace();
			String s = new String();
			s = Arrays.toString(VehicleType.values());
			throw new VehicleHandalingException("We only have these type of vehicles in our showroom " + s);
		}
	}

	public static LocalDate checkDate(String date) throws VehicleHandalingException {
		LocalDate d = LocalDate.parse(date);
		if (d.isBefore(thresholdDate))
			throw new VehicleHandalingException("Vehicle is too old");

		return d;
	}

}

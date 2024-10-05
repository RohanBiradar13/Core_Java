package utils;

import static com.app.core.VehicleType.valueOf;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Vehicle;

public interface CollectionUtils {
	 static List<Vehicle> populatedList() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("5R", "red", parse("2024-01-01"), valueOf("BIKE"), "Yamaha"));
		vehicles.add(new Vehicle("2R", "pink", parse("2022-12-01"), valueOf("SCOOTY"), "Honda"));
		vehicles.add(new Vehicle("6R", "blue", parse("2020-08-12"), valueOf("TRUCK"), "Tata"));
		vehicles.add(new Vehicle("4R", "silver", parse("2021-03-07"), valueOf("CAR"), "Tata"));
		vehicles.add(new Vehicle("1R", "yellow", parse("2024-01-08"), valueOf("CYCLE"), "Hercules"));
		vehicles.add(new Vehicle("3R", "lavender", parse("2023-04-09"), valueOf("BIKE"), "Honda"));

		return vehicles;

	}
}

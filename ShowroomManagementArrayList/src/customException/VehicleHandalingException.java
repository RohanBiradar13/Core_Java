package customException;

@SuppressWarnings("serial")
public class VehicleHandalingException extends Exception {
	public VehicleHandalingException(String mesg) {
		super(mesg);
	}
}

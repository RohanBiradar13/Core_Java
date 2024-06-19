package customException;

@SuppressWarnings("serial")
public class SpeedOutOfRange extends Exception {
public SpeedOutOfRange(String detailMessage) {
	super(detailMessage);
}
}

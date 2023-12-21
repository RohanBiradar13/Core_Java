package Validation;

import Exception.SpeedOutOfRangeException;

public class ValidateSpeed {
  public static final int MIN_SPEED;
  public static final int MAX_SPEED;
  static {
	  MIN_SPEED = 40;
	  MAX_SPEED = 80;
  }
  public static void checkSpeed(int speed)throws SpeedOutOfRangeException {
	  if(speed < MIN_SPEED) {
		  throw new SpeedOutOfRangeException("You are driving too slow!!!");
	  }
	  if(speed > MAX_SPEED) {
		  throw new SpeedOutOfRangeException("You are driving too fast!!!");
	  }
	  else {
		  System.out.println("you are within range..");
	  }
  }
}

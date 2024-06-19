package utils;

import customException.SpeedOutOfRange;

public class ValidationRules {
public static final int  MIN_SPEED ;
public static final int  MAX_SPEED ;
static {
	MIN_SPEED=40;
	MAX_SPEED=90;
}

public static void validateSpeed(int speed) throws SpeedOutOfRange {
	
	if(speed < MIN_SPEED) {
		throw new SpeedOutOfRange("You are too slow!");
	}if(speed > MAX_SPEED) {
		throw new SpeedOutOfRange("You are too fast!");
	} 
	System.out.println("You are within range");
	tp(speed);
}
public static void tp(int speed) throws SpeedOutOfRange{
	throw new SpeedOutOfRange("Hi");
}
}

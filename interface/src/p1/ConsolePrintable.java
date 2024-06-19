package p1;

public class ConsolePrintable implements Printable {

public void print(String mesg) {
	System.out.println("in consoleprintable "+mesg);
	System.out.println(DATA);
}
}

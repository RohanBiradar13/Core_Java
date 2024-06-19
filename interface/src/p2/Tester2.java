package p2;

import java.util.Scanner;

public class Tester2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Printable[] printables = {new ConsolePrintable(),new FilePrintable()};
	for (Printable p: printables ) {
		p.print("LOL");
	}
}
}

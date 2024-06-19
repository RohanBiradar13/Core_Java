package p4;

public class Tester1 {
public static void main(String[] args) {
	Printable p = new ConsolePrintable();
	p.print("Hi Man");
	
	p = new FilePrintable();
	((FilePrintable)p).test();
	
	p = new ConsolePrintable();
	//((FilePrintable)p).test();run time error class cast exception
	
	if(p instanceof FilePrintable) {
		((FilePrintable) p).test();
	}
	else {
		System.out.println("Invalid Type Of Object");
	}
	
}
}

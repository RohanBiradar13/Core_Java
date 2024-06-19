package p4;

public class FilePrintable implements Printable {

	@Override
	public void print(String mesg) {
		System.out.println("Storing a message in file "+mesg);
		
	}
	public void test() {
		System.out.println("in test");
	}

}

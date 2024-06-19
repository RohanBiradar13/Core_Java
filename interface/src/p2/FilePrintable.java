package p2;

public class FilePrintable implements Printable {

	@Override
	public void print(String mesg) {
		System.out.println("Storing a message in file "+mesg);
		
	}

}

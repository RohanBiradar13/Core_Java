package p6;

public class MyImplements implements I3{

	@Override
	public boolean test(int num) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(String mesg) {
		System.out.println("in I3 print method"+mesg);
		
	}
	

}

package p5;

public class C implements A,B{

	@Override
	public void calc(int a, int b) {
		System.out.println(A.DATA+" "+B.DATA);
		System.out.println(a+b);
		
	}

	@Override
	public String yz(String mesg) {
		
		return "in A yz method"+mesg;
	}

}

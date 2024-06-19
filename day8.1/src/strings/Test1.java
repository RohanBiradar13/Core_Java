package strings;

public class Test1 {
public static void main(String[] args) {
	String s="hello";
	s.concat("hi");
	System.out.println(s.concat("hi"));
	System.out.println(s);//org->hello
	s+="ro";
	System.out.println(s);//->helloro
	s+=12345;//change
	System.out.println(s);//change
	String s1=s.toUpperCase();//
	System.out.println(s);//hello12345
	System.out.println(s1);//HEELL12345
}
}

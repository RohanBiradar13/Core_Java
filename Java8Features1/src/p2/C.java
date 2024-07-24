package p2;

public class C implements A,B{
	//In case of duplicate methods: javac FORCES to iverride the def method impl.(Otherwise gives javac err)
	
@Override
public void show() {
	System.out.println("overriding duplicate default method in c");
	//how to refer to inherited function? i/f Name,super.methodName
	A.super.show();
	B.super.show();
	System.out.println(A.DATA);
	System.out.println(B.DATA);
	
}
}

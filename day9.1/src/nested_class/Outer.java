package nested_class;

public class Outer {
 private int i;
 private static int j;
 static{
	 j=13;
 }
 public Outer(int i) {
	 super();
	 this.i=i;
 }
 public static void show() {
	 System.out.println("outer's static method "+j);
 }
 public void display() {
	 System.out.println("outer's non-static method"+i+" "+j);
 }
 //non static nested  class
 class Inner{
	 private int k;
	 //private static final int l;//can not define static member in inner class
		/*
		 * static { l=123; }
		 */
	 private static final int l =1234;
	 public Inner(int k) {
		 super();
		 this.k=k;
	 }
	 //static method
		/*
		 * public static void test() {
		 * 
		 * }
		 */
	 //non static method
	 public void innershow() {
		 System.out.println("inner's details"+k+" "+l);
		 System.out.println("outher's details"+i+" "+j);//inner class method can access outer class member even 
		 //if they are private
	 }
 }
}

class A {
	int i;

	public void display() {
		System.out.println("in class A method");
		System.out.println(i);
	}
}

class B extends A {
	int j;

	public void display() {
		System.out.println("in class B method");
		System.out.println(j);
	}
}

class Inheritance2 {
	public static void main(String args[]) {
		B obj2 = new B();
		obj2.i = 1;
		obj2.j = 2;
		obj2.display();
		A r;
		r = obj2;
		r.display();
		A obj1 =new A();
		obj1.i = 10;
		obj1.display();

		B b2 = new B();
		b2.i = 15;
		b2.j = 20;
		b2.display();
	}
}
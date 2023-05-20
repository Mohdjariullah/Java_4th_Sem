package sam;

import java.io.*;

interface A {
	void print();
}

class B {
	void display() {
		System.out.println("From Parent class B");
	}
}

class C extends B implements A {
	public void print() {
		System.out.println("From Child class C");
	}

	public static void main(String arg[]) {
		C obj = new C();
		obj.print();
		obj.display();
	}
}
package sam;

interface A2 {
	public void display1();

public void display2();
}

class B2 implements A2 {

	public void display1() {
		System.out.println(" Display 1 Inside B");
	}

	public void display2() {
		System.out.println("Display 2 Inside B");
	}
}

class demo11 {
	public static void main(String a[]) {
		B2 obj = new B2();
		obj.display1();
		obj.display2();
	}
}
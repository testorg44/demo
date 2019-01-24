package org.apex.Assignment;

public class A {
	void temp() {
		System.out.println("class A");
	}
}

interface B {

	default void temp() {
		System.out.println("interface A this is added");
	}

	void display();
}

class C extends A implements B {

	public static void main(String[] args) {
		C c = new C();
		c.display();
		c.temp();

	}

	public void temp() {
		super.temp();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}
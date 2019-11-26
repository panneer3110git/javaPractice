package org.panneer.com.javaPractice.basic;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		double b = 20.5d;
		AddTwoNumbers add = new AddTwoNumbers();
		System.out.println(add.add(a,b));
	}

	public int add(int a, int b) {
		return (a + b);
	}

	public float add(float a, float b) {
		return (a + b);
	}
	
	public double add(double a, double b) {
		return (a + b);
	}
	
	public float add(int a, float b) {
		return (a + b);
	}
	
	public float add(float a, int b) {
		return (a + b);
	}


}

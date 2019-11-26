package org.panneer.com.javaPractice.basic;

public class AddTwoBinaryNumbers {

	public static void main(String[] args) {
		int number1 = 100100;
		int number2 = 010010;
		int remainder1;
		int remainder2;
        while(number1!=0&&number2!=0) {
        	remainder1=number1%10;
        	remainder2=number2%10;
        	number1=number1/10;
        	number2=number2/10;
        	
        }
	}

}

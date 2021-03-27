package com.internsharla.java;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		String name;
		Scanner xm = new Scanner(System.in);
		name = xm.nextLine();
		System.out.print("my name is "+ name);

		xm.close();   //to avoid memory leakage we need to close the scanner class variable(xm here)
	}

}

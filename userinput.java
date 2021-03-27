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




package com.internsharla.java;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		
		String name;
		int age;

		// Write your code here
		Scanner sca = new Scanner(System.in);
		//name = sca.nextLine();
		System.out.println("my name is:");
		name = sca.nextLine();

		//age = sca.nextInt();
		System.out.println("my age is: ");
		age = sca.nextInt();

		System.out.println("my name is "+ name);
		System.out.println("mys age is " + age);

		sca.close();

	}
}

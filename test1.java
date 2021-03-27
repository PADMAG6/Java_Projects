package com.internsharla.java;

import java.sql.SQLOutput;
//import java.sql.Time;
import java.sql.Time;
import java.util.Date;
import java.time.Clock;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Userinput {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

	/*	int a, b, d;
		a = 24;
		b = 43;
		System.out.println("before swap a value is: " + a + " b vale is: " + b);
		d = a;
		a = b;
		b = d;

		System.out.println("After swap a is : " + a + " b is: " + b); */
	}
}


package com.internsharla.java;

import java.sql.SQLOutput;
//import java.sql.Time;
import java.sql.Time;
import java.util.Date;
import java.time.Clock;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Userinput {
	public static void main(String[] args) {
		/* Date date = new Date();
		System.out.println(date);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);*/

	/*	int a, b, d;
		a = 24;
		b = 43;
		System.out.println("before swap a value is: " + a + " b vale is: " + b);
		d = a;
		a = b;
		b = d;

		System.out.println("After swap a is : " + a + " b is: " + b); */
		 int f1 = 98;
		int f2 = 45;
		int f3 = 56;
		if (f1 > f2) {
			System.out.println("f1 is higest bid");
		}
		else {
			if (f2 > f3) {
				System.out.println("f2 is highest bid");
			} else {
				System.out.println("f3 is highest bid");
			}
		} 
	}
}

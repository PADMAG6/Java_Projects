package com.internsharla.java;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		//String green;
		String trafic_light = "green";
		if (trafic_light == "red") {
			System.out.print("You are allowed to move");
		}

		else {
			System.out.print("Please Stop");
		}
	}
	}


//ternary operator          Condition? Exp1:Exp2
package com.internsharla.java;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		//String green;
		boolean isGreen = false;
		String msg=isGreen? "Please Stop" : "You are allowed to move";
		System.out.println(msg);

	}
	}

// if else if statement:
package com.internsharla.java;

//import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		//String green;
		char gade;
		int score =  10;
		if (score >= 90) {
			 gade = 'A';
		} else if(score >= 80) {
			 gade = 'B';
		} else if (score >= 70) {
			gade = 'D';
		} else {
			gade= 'F';
		}
		System.out.println("grade of studen is:"+ gade);
	}
	
	
	
// switch stament with break	
package com.internsharla.java;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		//String green;
		char gade;
		int score = 100;
		if (score >= 90) {
			gade = 'A';
		} else if (score >= 80) {
			gade = 'B';
		} else if (score >= 70) {
			gade = 'C';
		} else {
			gade = 'F';
		}
		System.out.println("grade of studen is:" + gade);
		gade = 'X';

		switch (gade) {
			case 'A':
				System.out.println("very good marks");
				break;
			case 'B':
				System.out.println("good marks");
				break;
			case 'C':
				System.out.println("average marks");
				break;
			case 'F':
				System.out.println("failed");
				break;
			default:
				System.out.println("no existing grade");

		}
		}
	}
	
	
	
	

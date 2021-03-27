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


package com.internsharla.java;

import java.util.Scanner;

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
	

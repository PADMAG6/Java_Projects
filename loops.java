// for loop
public class Main {
    public static void main(String[] args) {
        for (int ctr = 1 ; ctr > 7; ctr++) {
            System.out.println("Hello Java");
        }
    }
}

//while loop
package com.internsharla.java;

public class Main {

    public static void main(String[] args) {

        int num = 5;
        while (num > 0) {
            System.out.println("hello "+ num);
            num--;
        }
    }
}


// do-while loop
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
		int number=0;
		int sum=0;
		do {
			Scanner num = new Scanner(System.in);
			number = num.nextInt();
			System.out.println("enter the number " + number);
			sum += number;
		} while (number != 0);
		System.out.println("show the sum: " + sum);

		}


	}

//simple-progrm:  sum of numbers in java
package com.internsharla.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1, number2,number3;
        Scanner num = new Scanner(System.in);
        number1 = num.nextInt();
        /*number2 = num.nextInt();
        number3 = num.nextInt();
        System.out.println("enter number3 : " + number3);
        System.out.println("enter number2 : " + number2);*/
        System.out.println("enter number1 : " + number1);

        // int sum = number1 + number2 + number3;
        int sum = 0;
        sum += number1;
        System.out.println("sum of numbers : " + sum);

    }
}



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Using For Loop

		int flag = 0;

		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
                if(num == 0){
                    System.out.println("Not prime");
                    System.exit(0);
                }
		for(int i = 2; i < num; i++){
			if( num % i == 0) {
				System.out.println(num + " is not prime");
				flag = 1;
				break;
			}
		}

		if(flag == 0)
			System.out.println(num + " is prime");

		// Using While Loop

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
                if(number == 0){
                    System.out.println("Not prime");
                    System.exit(0);
                
		int counterFlag = 0;
		int i = 2;

		while (i < number) {

			if( number % i == 0) {
				System.out.println(number + " is not prime");
				counterFlag = 1;
				break;
			}
			i++;
		}

		if(counterFlag == 0)
			System.out.println(number + " is prime");

		scanner.close();
	}
}

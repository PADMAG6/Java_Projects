package com.internsharla.java;
 public class Main {

	 public static void main(String[] args) {
	 	int sum_no1 = sum_number(23,56);
		 System.out.println(sum_no1);
		 int sum_no2 = sum_number(45,79);
		 System.out.println(sum_no2);

	 }

	 private static int sum_number(int i, int i1) {
	 	int sum_no = i+ i1;
	 	return sum_no;

	 }

 }


// website solution to method sum numbers exxample
public class Main {

	public static void main(String[] args) {

		// Sum of two numbers. Let's fine out sum of 3 and 18

		int sum = add(3, 18);
		System.out.println("Sum is : " + sum);

	}

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}

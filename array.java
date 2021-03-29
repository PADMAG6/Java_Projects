package com.internsharla.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int sum;
    	int[] myArray = new int[5];   //declare size of array
	    int[] myArray2 = new int[5];
	    myArray[0] = 23;
	    myArray[1] =45;
	    myArray[2] = 65;
	    myArray[3] =89;
	    myArray[4]= 34;
	    myArray2[0] =56;
	    myArray2[1] = 45;
	    myArray2[2] = 56;
	    myArray2[3] = 34;
	    myArray2[4] = 56;
	    for (int num: myArray){                    //foreach loop declaring
	        System.out.println("print 1st array " + num);
	        for (int i: myArray2) {
		        System.out.println("print 2nd array: " + i);
		        sum = num + i;
		        System.out.println("sum of array: " + sum);
	        }
        }
    }
}

///* FOR EACH Loop Practice */

// Define a double array and use For Each loop to find the sum of all the numbers stored in the array.
public class Main {
    public static void main(String[] args) {

        double[] arr = {3.3, 4.7, 6.5, 7.5, 10.0};
        double sum = 0;

        for (double i:arr) {
            sum += i;
        }
        System.out.println(sum);
      
      
      
      
      
      
 //
      public class Main {

	public static void main(String[] args) {

		// Sum of elements of 2D array

		int[][] myFirst2DArray = {
				{ 3, 5, 1, 9 },
				{ 10, 15, 3, 0  },
				{ 1, 11, 31, 90 },
				{ 2, 51, 1, 9 }
		};

		int sum = 0;

		for (int row = 0; row < myFirst2DArray.length; row++) {

			for (int column = 0; column < myFirst2DArray[row].length; column++) {
				sum = sum + myFirst2DArray[row][column];
				System.out.print(myFirst2DArray[row][column] + " ");
			}

			System.out.println();
		}

		System.out.println("Sum is : " + sum);
	}
}
      
      
      
      
      
    }
}



package com.internsharla.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int sum=0;
    	//int[] myArray = new int[5];   //declare size of array
	    //int[] myArray2 = new int[5];
	   int[] myArray = new int[]{23, 23, 45, 67, 34}; //loading the array

	    for (int num: myArray) {                    //foreach loop declaring
		    System.out.println("print 1st array " + num);
		    sum += num;
	    }
	    System.out.println("print sum: " + sum);
	        /*for (int i: myArray2) {
		        System.out.println("print 2nd array: " + i);
		        sum = num + i;
		        System.out.println("sum of array: " + sum);*/
	        }
        }



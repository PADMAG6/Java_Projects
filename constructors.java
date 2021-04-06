// this code is in Dog.java file , the constructor called in main.java file

package com.internsharla.java;

public class Dog {

	public Dog() {             //default constructor
		System.out.println("dog is barking");
	}
	public Dog(String b,String c, int s){       //parameterized constructor
		System.out.println("this is 2nd dog");
	}
  
  
  // main.java file for constructor
  package com.internsharla.java;

public class Main {


	//Dog r1 = new Dog();

	public static void main(String[] args) {
		Dog r1 = new Dog();
		//System.out.println(r1);

		Dog r2 =  new Dog("german shepard", "black", 234);

		}

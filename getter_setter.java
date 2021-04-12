Dog.java

package com.internsharla.java;

public class Dog {
	private String breed;   //instance variable
	private int size;
	private String color;

	public void bark() {
		System.out.println(" Wooh! wooh !");
	}

	public void run() {
		System.out.println(" My breed is " + breed + ". I am running ");

	}

	//Getter and Setter
	public String getBreed() {  //geter for length
		return breed;
	}
	public void setBreed(String breed){  //setter for length
		this.breed = breed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}



Main.java
package com.internsharla.java;

public class Main {


	//Dog r1 = new Dog();

	public static void main(String[] args) {
		Dog r1 = new Dog();
		r1.setBreed("german shepperd");
		r1.setColor("red");
		r1.setSize(123);
		//System.out.println(r1);

		System.out.println(r1.getBreed());
		System.out.println(r1.getColor());
		System.out.println(r1.getSize());

		}

		/*Cake r1 = new Cake();
		r1.cakeName = "Black forest";
		r1.flavour = "chocolate";
		r1.isAvailable = true;
		r1.price = 500;
		System.out.println(r1.cakeName);*/

     /* rectangle proper = new rectangle();
      proper.length=34;
      proper.breadth = 56;
		System.out.println(proper.getArea());
      proper.getPrimeter();
		//System.out.println(proper.length);

      rectangle r1 = new rectangle();
      r1.length = 67;
      r1.breadth = 23;
		System.out.println(r1.getArea());
		System.out.println(r1.getPrimeter());*/
	}





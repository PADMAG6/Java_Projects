package com.internsharla.java;

public class Main {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.setColour("black");
		dog.setName("Nimmy");
		System.out.println(dog.getName());

		Animal ani = new Animal();
		ani.setName("Rujjy");
		System.out.println(ani.getName());
	}

}
class Animal {
   String name;

   public String getName() {
   	return name;
   }
   public void setName(String name){
   	this.name = name;
   }

   public void run() {
	   System.out.println("Animal is running");
   }
}
class Dog1 extends Animal {
	String colour;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void brak() {
		 System.out.println("Wooh ! Wooh !");
	 }

}
class Puppy extends Dog1 {
	String size;
	int age;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sound() {
		System.out.println("chuu chuu");
	}
}

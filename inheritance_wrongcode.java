package com.internsharla.java;

public class Main {
	private String name;
	private String color;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		Animal ani = new Animal();
		Puppy pup;
		pup = ani.new Puppy();

		pup.age = 123;
	}
	static class Animal {
		String name;

		public void run() {
			System.out.println("Animal running");
		}

		public class Puppy extends Main.Puppy {
		}
	}

	class Dog1 extends Animal {
		String color;

		public void bark() {
			System.out.println("Wooh ! wooh !");
		}
	}

	class Puppy extends Dog1 {
		String Size;
		int age;

		public void meow() {
			System.out.println("Meow ! meow !");
		}
	}
}

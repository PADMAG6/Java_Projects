package com.internshala.javaapp;


public class Main {

    public static void main(String[] args) {


                Animal A1 = new Animal();
                A1.setName("Rocky");
                A1.setSize(40);
                System.out.println(A1.getName());
                System.out.println(A1.getSize());
                A1.run();

                Dog d2=new Dog();
                d2.setName("Snoopy");
                d2.setSize(50);
                d2.setcolour("BlackWhite");
                System.out.println(d2.getName());
                System.out.println(d2.getSize());
                System.out.println(d2.getColour());
                d2.bark();
                d2.run();

                puppy p1=new puppy();
                p1.setSize(28);
                p1.setAge(3);
                System.out.println(p1.getSize());
                System.out.println(p1.getAge());
    }
}
class Animal {
    String Name;
    int Size;

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }
    public void run() {
        System.out.println("Animal Is Running");
    }
}
class Dog extends Animal {
    String colour;

    public String getColour(){
        return colour;
    }
    public void setcolour(String colour){
        this.colour=colour;
    }
    public void bark() {
        System.out.println("Wooh Wooh Wooh");
    }
    public void run() {
        System.out.println("Dog Is Running");
    }
}
class puppy extends Dog{
    int Age;

    public int getAge(){
      return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    }

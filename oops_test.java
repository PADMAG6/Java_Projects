package com.internsharla.java;


import static java.lang.Math.PI;

public class Main {
	public static void main(String[] args) {

    Area are = new Area();
    are.circle(3);
	}
}
class Area {
	int length;
	int breath;
	float radius;

	public void rectangle(int length, int breath) {
        int area = length * breath;
		System.out.println(area);
	}

   public void square(int length) {
		float area = length * length;
	   System.out.println(area);
   }

   public float circle(int radius) {
		float area = (float) (PI * radius * radius);
	   System.out.println(area);
	   return area;
   }

}

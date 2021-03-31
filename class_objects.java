//This is rectangle class  file (Rectangle.java) and this class is called in the main.java file.

package com.internsharla.java;

public class Rectangle {
	public int length;
	public int breadth;


    public int getArea() {
	   int area = length * breadth;
	   return area;
	//System.out.println(length * breadth);
    }
    public int getPrimeter() {
	   int perimeter = 2 * (length + breadth);
	    return perimeter;
	//System.out.println(length + breadth);
    }
}





//main.java
package com.internsharla.java;

public class Main {

public static void main(String[] args) {
      Rectangle proper = new Rectangle();
      proper.length=34;
      proper.breadth = 56;
		System.out.println(proper.getArea());
      proper.getPrimeter();
		//System.out.println(proper.length);

      Rectangle r1 = new Rectangle();
      r1.length = 67;
      r1.breadth = 23;
		System.out.println(r1.getArea());
		System.out.println(r1.getPrimeter());
	}
}



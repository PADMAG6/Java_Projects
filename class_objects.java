//This is rectangle class  file (Rectangle.java) and this class is called in the main.java file.

package com.internsharla.java;

public class Rectangle {
	public int length;           //here length is instance variable
	public int breadth;         // breadth instance varible


    public int getArea() {
	   int area = length * breadth;            //here area is local variable, it is decleard in method
	   return area;
	//System.out.println(length * breadth);
    }
    public int getPrimeter() {
	   int perimeter = 2 * (length + breadth);  //perimeter is local variable
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

      Rectangle r1 = new Rectangle();          //here Rectanlg is class, r1 is reference variable, new Rectagle() is object
      r1.length = 67;
      r1.breadth = 23;
		System.out.println(r1.getArea());
		System.out.println(r1.getPrimeter());
	}
}



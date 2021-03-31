//This is rectangle class  file (Rectangle.java) and this class is called in the main.java file.

package com.internsharla.java;

public class Rectangle {
	public int length;
	public int breadth;


public void area() {
	System.out.println(length * breadth);
}
public void primeter() {
	System.out.println(length + breadth);
}
}


//main.java
package com.internsharla.java;

import sun.misc.Cache;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      Rectangle proper = new Rectangle();
      proper.length=34;
      proper.breadth = 56;
      proper.area();
      proper.primeter();
		System.out.println(proper.length);


	}
}


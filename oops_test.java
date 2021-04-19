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
--------------------------------------------------------
package com.internsharla.java;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student(1,"ram",99);
		Student s2 =  new Student(2,"rani",67);
		Student s3 = new Student(3,"raju",45);


		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		for (Student stu : studentList) {
			System.out.println(stu.rol + " " + stu.marks + " " + stu.name);

		}
      	}
}
class Student {
	int rol;
	String name;
	int marks;

	Student(int rol, String name , int marks) {
		this.rol = rol;
		this.name =  name;
		this.marks = marks;
	}

}
------------------------------------interface ---------------------
package com.internsharla.java;

public class Main {
	public static void main(String[] args) {
		Perimeter peri = new Area1();
		peri.perimenter(2,5);

	}
}
interface Perimeter {

	 void perimenter(int i, int i1);

}

class Area1 implements Perimeter {

	@Override
	public void perimenter(int l, int w) {
		int p= 2 * (l+w);
		System.out.println(p);
	}
}




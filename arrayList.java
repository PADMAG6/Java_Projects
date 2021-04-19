package com.internsharla.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Remote remote = new Television
		List<String> namesList = new ArrayList(); //alldata tpes should be in caps not start with small letters
		new ArrayList();
		// import data into array
		namesList.add("Sam"); //0 index
		namesList.add("Ram"); // index 1
		namesList.add("Raju"); // index 2
		namesList.add("Sam"); //index 3

		//excess data from array
		System.out.println(namesList.get(0));

		//using For-Each loop
		for (String name: namesList) {
			System.out.println(name);
		}


	}

}


-------------------------------------------------------------------------------------------------------------------------------

package com.internsharla.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Remote remote = new Television
		List<String> namesList = new ArrayList(); //alldata tpes should be in caps not start with small letters
		new ArrayList();
		// import data into array
		namesList.add("Sam"); //0 index
		namesList.add("Ram"); // index 1
		namesList.add("Raju"); // index 2
		namesList.add("Sam"); //index 3

		//excess data from array
		System.out.println(namesList.get(0));
		//remove element
		namesList.remove(1);
		namesList.add("rani");
		//add element where u want
		namesList.add(2, "raajji");

		//using For-Each loop
		for (String name : namesList) {
			System.out.println(name);
		}

		// Create a Arraylist of Employee nd print out the names.
		Employee e1 = new Employee("geni");
		Employee e2 = new Employee("gini");
		Employee e3 = new Employee( "gittu");

		List<Employee> employeeList = new ArrayList();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		for (Employee employee  : employeeList) {
			System.out.println(employee.name);
		}


	}
}
class Employee {
	String name;
	public Employee(String name) {
		this.name = name;

	}

    }

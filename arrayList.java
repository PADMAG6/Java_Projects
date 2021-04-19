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

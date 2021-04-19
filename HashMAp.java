package com.internsharla.java;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		//"rollNo" = "23"
		// "DOB" = "12.7.1993"
		// "name" = "Raju"

		Map<String, String> nameMap = new HashMap();
		nameMap.put("name", "Raju");
		nameMap.put("DOB", "12.7.1993");
		nameMap.put("rollNo" , "23");

		String na = nameMap.get("name");
		System.out.println(na);

		for (Map.Entry entry: nameMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}


	}
}

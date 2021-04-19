package com.internsharla.java;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

	String data = "I love India";  // declare data here
	try {
		FileOutputStream fos = new FileOutputStream("myfile.txt");  //we need to create a file output stram to create and open file
		byte[] byteData = data.getBytes(); //write method to write data to file
		fos.write(byteData);
		fos.close();   // to close the file, no memory and leackage
	} catch (IOException ex) {
		System.out.println(ex);
	}



	}
}


package com.internsharla.java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
    //write data
	String data = "I love India";
	try {
		FileOutputStream fos = new FileOutputStream("myfile.txt");
		byte[] byteData = data.getBytes();
		fos.write(byteData);
		fos.close();
	} catch (IOException ex) {
		System.out.println(ex);
	}
    //Read datd
		try {

			FileInputStream fis = new FileInputStream("myfile.txt");      //use fileinputstream to open file
			int i = 0;
			while ((i = fis.read()) != -1) { // -1 is end of file it is default present in java
				System.out.println((char) i); //use read() to read from the file opend
			}
			fis.close();  //use close() to close the stream
		} catch (IOException x) {
			System.out.println(x);


	    }



	}
}

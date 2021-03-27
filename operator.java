// Left to Righr, [ * / % ] > [+ -]   operator precedence
package com.internsharla.java;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		int result = 3 * (10 - 2) % 5/2;
		System.out.println(result);

	}
}
// 'sout' is shoutcut for system.out.print() in java intellij editor

package com.internsharla.java;

//import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		int income = 30000;
	    int bouns  = 5000;
	     //income += bouns;
	     income *= bouns;
		System.out.println(income);

	}
}



package com.internsharla.java;

//import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		int num = 8;
		System.out.println(num++ - ++num + --num);
	}
}

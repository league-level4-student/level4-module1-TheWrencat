package _06_Snake;

import java.util.Random;

public class Checkpoint {
//	1.  Create an integer variable and initialize it to a random number between 0-4.
//
//	2.  Use a switch statement to print a different response based on the value of the integer created in step 1.
	public static void main(String[] args) {
	
	 Random r = new Random();
	 int rad = r.nextInt(5);
	 
	 switch(rad) {
	 case 0:
		 System.out.println("Zero");
		 break;
	 case 1:
		 System.out.println("One");
		 break;
	 case 2:
		 System.out.println("Two");
		 break;
	 case 3:
		 System.out.println("Three");
		 break;
	 case 4:
		 System.out.println("Four");
		 break;
	 default: 
		 System.out.println("Oh noes");
		 break;
	 }
	}
}

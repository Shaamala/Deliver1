package Deliver1;

import java.util.Scanner; // Calling in Scanner to get some user input.

public class Deliver1 {
	// Creating a main method.
	public static void main(String [] arg) {
			int firstNum;
			int secondNum;
			// Creating a Scanner object
			Scanner scnr = new Scanner(System.in);
			// Prompt for enter two number
			System.out.println("Please enter two 3 digits Positive Numbers");
			firstNum = scnr.nextInt();
			secondNum = scnr.nextInt();
		
			if ((firstNum >= 0) && (secondNum >= 0)){
			     
			    int firstnum1 = firstNum % 10;
			    int fisrtnum2 = firstNum / 10 % 10;
			    int firstnum3 = firstNum /100 % 10;
		
			    int secondNum1 = secondNum % 10;
			    int secondNum2 = secondNum / 10 % 10;
			    int secondNum3 = secondNum /100 % 10;
			    int num1 = firstnum1 + secondNum1;
			    int num2 = fisrtnum2 + secondNum2;
			    int num3 = firstnum3 + secondNum3;
			    if ((num1 == num2)  && (num1 == num3)){
			    System.out.println("True");
			    }
			    else { 
			    System.out.println("False");
			    }
			 }
			else {
			System.out.println("Please enter Positive Numbers");
			}
}
}

package problems_set_1;

import java.util.Scanner;

public class PrintUserGivenInteger {
	public static void main(String[] args) {
		//creates a reader instance which takes input from user from keyboard
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the number you need to print:  ");
		// nextInt reads the next integer from the keyboard
		int number = reader.nextInt();
		// Println() prints the line, we want to show in our output screen
		System.out.println("Your Number is  "+number);
		
	}
}



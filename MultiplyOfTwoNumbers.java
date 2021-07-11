package problems_set_1;

import java.util.Scanner;

public class MultiplyOfTwoNumbers {
	public static void main(String[] args) {
		//creates a scan instance which takes input from user from keyboard
		Scanner scan=new Scanner(System.in);
		// Println() prints the line, we want to show in our output screen
		System.out.println("Enter a value for a:");
		// nextInt reads the next integer from the keyboard
		int a=scan.nextInt();
		// Println() prints the line, we want to show in our output screen
		System.out.println("Enter a value for b :");
		// nextInt reads the next integer from the keyboard
		int b=scan.nextInt();
		int c = a*b;
		System.out.println("The multiplication of a & b is = " + c);
		
		
	}

}

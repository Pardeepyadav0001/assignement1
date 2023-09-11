package assignment1;

import java.util.Scanner;

public class factorial {

	public static int printfact(int n) { // method declare
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num = num * i;
		}
		System.out.println("Factorial of " + n + " :" + num);
		return num;
	}

	public static void main(String[] args) { // main function
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any integer:");
		int n;
		n = sc.nextInt(); // getting input with the help of scanner class
		printfact(n); // method calling

	}
}
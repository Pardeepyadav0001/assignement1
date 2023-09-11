package assignment1;

import java.util.Scanner;

public class factorialusingrecursion {
	static int factorial(int n) // method to find factorial of given number
	{
		if (n == 0)
			return 1;

		return n * factorial(n - 1); // using recurion to get factorial
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt(); // getting input with the help of scanner class
		System.out.print("Factorial of " + n + " is " + factorial(n)); // method calling

	}
}

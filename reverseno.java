package assignment1;

import java.util.Scanner;

public class reverseno {

	public static int rno(int n) {
		int output = 0;

		while (n != 0) { // run loop until n becomes 0

			int digit = n % 10; // get last digit from n

			output = output * 10 + digit;

			n /= 10; // remove the last digit from n
		}
		System.out.println("reverse no: " + output);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");

		int p = sc.nextInt(); // gettting input
		rno(p); // method is calling

	}
}

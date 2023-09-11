package assignment1;

import java.io.*;
import java.util.*;

public class reversestring {

	public static String reverse(String s) {

		String output = "";

		for (int i = 0; i < s.length(); i++) { // loop will itrate till the length of a string
			char ch1 = s.charAt(i); //extracts each character
			output = ch1 + output; //adds each character in front of the existing string
		}

		System.out.println(output);

		return output; // returns the output to the method
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String p = sc.next(); // gettting input 
		reverse(p); // reverse method is calling 

	}
}

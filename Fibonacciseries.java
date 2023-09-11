package assignment1;

public class Fibonacciseries {

	public static void printfs() { // printfs ia a method for printing Fibonacciseries

		int n = 10, firstTerm = 0, secondTerm = 1; // initailize the variables
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; i++) { // loop used for to iterate upto n
			System.out.print(firstTerm + ", ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printfs(); // printfs method is call
	}
}

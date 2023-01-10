package importantQuestion;
// Write a program to print fibonaaci series without recursion

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3, i;
		System.out.println("Enter the number of elements in the series");
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		sc.close();
		System.out.print(n1 + " " + n2);
		for(i = 2; i<max; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	
		// TODO Auto-generated method stub

	}

}

package importantQuestion;

import java.util.*;

public class FibonacciSeries1 {
	public static int fibonacciRec(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		return fibonacciRec(n-2) + fibonacciRec(n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in the series");
		int max = sc.nextInt();
		sc.close();
		for(int i = 0; i<max; i++)
			System.out.print(fibonacciRec(i) + " ");
		
	}

}

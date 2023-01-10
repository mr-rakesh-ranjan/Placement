package importantQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int number = sc.nextInt();
		sc.close();
		if(checkPrime(number))
			System.out.println(number + " : is a prime number");
		else
			System.out.println(number + " : is not a prime number");
		
	}

	private static boolean checkPrime(int n) {
		if(n<=1)
			return false;
		int i = 2;
		while(i<=n/2) {
			if((n%i)==0)
				return false;
			i++;
		}
		return true;
	}

}

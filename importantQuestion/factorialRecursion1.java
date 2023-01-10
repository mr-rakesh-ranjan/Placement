//write a program to find factorial of given number using without recursion

package importantQuestion;

import java.util.Scanner;

public class factorialRecursion1 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);

	}

}

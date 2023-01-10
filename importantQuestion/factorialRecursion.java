// write a program to find factorial of given number using recursion

package importantQuestion;

import java.util.Scanner;

public class factorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }


}


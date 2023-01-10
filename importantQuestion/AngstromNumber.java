//Write a to check angstrom number 

// Angstrom Number = A positive integer is called an Armstrong number of order n if $(order means no. of digit in the number)

//abcd... = a^n + b^n + c^n + d^n + ...

//In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. 

// example - 153 = 1*1*1 + 5*5*5 + 3*3*3  $$ 153 is an Armstrong number.

package importantQuestion;

import java.util.Scanner;

public class AngstromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNumber, remainder, result = 0, n = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
        originalNumber = number;

//        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;
        System.out.println(originalNumber);

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

	}

}

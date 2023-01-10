//write a program to swap two number without using 3rd variables 

package importantQuestion;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        /*Define variables*/  
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        sc.close();
        System.out.println("before swapping numbers: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   

	}

}

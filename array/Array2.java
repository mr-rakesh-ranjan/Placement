// Array 2 :- Find the maximum and minimum element in an array


package array;

import java.util.Scanner;

/**
 * @author rakes
 *
 */
public class Array2 {
	
	// function for maximum in array
	static int maximum(int arr []) {
		int n = arr.length;
		for(int i =0; i<n;i++) {
			boolean flag = true;
			for(int j=0;j<n;j++) {
				if(arr[j]>arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag == true)
				return arr[i];
		}
		return -1;
	}
	
	// function for minimum element in the given array 
	static int minimum(int arr []) {
		int n = arr.length;
		for(int i =0; i<n;i++) {
			boolean flag = true;
			for(int j=0;j<n;j++) {
				if(arr[j]<arr[i]) {
					flag = false;
					break;
				}
			}
			if(flag == true)
				return arr[i];
		}
		return -1;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int l = sc.nextInt(); 
        int a [] = new int[l];
        // taking input
        for(int i =0; i<a.length;i++){
            System.out.print("Enter the " + i+ " element of array");
            a[i] = sc.nextInt();
        }
        sc.close();
		System.out.println("The maximum and manimum element in the given array is " + maximum(a) + ", "+minimum(a)+ " respectively" );

	}

}

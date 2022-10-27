// WAP to sort string array in reverse order
package com.src;
import java.util.Arrays;
import java.util.Scanner;

public class Revorder {
	// main class initialization
	public static void main(String[]args) {
		// TODO auto generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	// taking input from the user as integer type
   
	String str=sc.next();
	//declaration of an array
	char arr[]=str.toCharArray();
	// sort the array by built in method
	Arrays.sort(arr);
// print the array using for loop
	for(int i=arr.length-1;i>=0;i--) {
		
	System.out.println(arr[i]+"");
		
	}
	sc.close();
	}

	}
	




// WAP to print reverse of numbers for example 10 9 8 7 6 5 4 3 2 1 using
// do-while loop and take the input from the user
package com.src;
import java.util.Scanner;

public class Reverse {
	// main class initialization
	public static void main(String[]args) {
		// TODO auto generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	// taking input from the user as integer type
   
	String arr=sc.nextLine();
	char a[]=arr.toCharArray();
	System.out.println("reverse of a string");
	int i=a.length;
	for(int j=i;j>0;j--) {
		System.out.println("a[j-i]");
	}
	
	}
	
}
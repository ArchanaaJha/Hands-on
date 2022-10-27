// WAP to print Happy Diwali in string array
package com.src;
import java.util.Scanner;
public class Happydiwali {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
        String str=sc.next();
		// Declaration of array
	char arr[]=str.toCharArray();
	System.out.println("print the reverse array");
	// print the array using for loop
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]+"");
	}
	sc.close();
	}
	
}
//WAP to print the array in ascending order 
package com.src;
import java.util.Scanner;

public class Ascenorder {
    public static void main(String[] args) {
    	int temp=0;
	Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of an array");
     int s=sc.nextInt();
     // Declaration of array
     int[] arr=new int[s];
     System.out.println("enter an element of  array");
     // traverse the array to take input from the user
     for(int i=0;i<s;i++) {
    	 arr[i]=sc.nextInt();
    	 
     }
     // Swap the array elements to sort the array
     for(int i=0;i<arr.length;i++) {
    	 for(int j=i=1;j<s;j++) {
    		 if (arr[i]>arr[j]) {
    			 temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
     }
     System.out.println("array print in ascending order");
    // print array using for loop
    for(int i=0;i<s;i++) {
    	System.out.println(arr[i]);
    }
    sc.close();
    }
}
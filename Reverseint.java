package com.src;

import java.util.Scanner;

public class Reverseint {
	public static void main(String[] args) {
		// TODO AUto generate method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a size");
		        int n=sc.nextInt();
		        int arr[]=new int[n];
		        System.out.println("enter elements");
		      for(int i=0;i<n;i++) {
		    	  arr[i]=sc.nextInt();
		      }
		      for(int j=n;j>0;j--) {
		        	System.out.println(arr[j-1]);
		        }


}
}


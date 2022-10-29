//program to perform array division

package com.src;

import java.util.Scanner;

public class Arrdiv {
	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		n=sc.nextInt();
		System.out.println("enter the column");
		m=sc.nextInt();
		int arr[][]=new int[n][m];
		int crr[][]=new int[n][m];
	    int aaa[][]=new int[n][m];
	    
			    System.out.println("enter the elements of 1st matrix;");
               for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<m;j++) {
		    		arr[i][j]=sc.nextInt();
		    		System.out.println();
		    	}
		    }
		    System.out.println("enter the elements of 2nd matrix");
		    for(int i=0;i<n;i++) {
		    	for(int j=0;j<m;j++) {
		    		crr[i][j]=sc.nextInt();
		    		System.out.println();
		    	}
		    	
		    		}
		    System.out.println("division of the two matrix");
		    for(int i=0;i<n;i++) {
		    	for(int j=0;j<m;j++) {
		    		aaa[i][j]=arr[i][j]/crr[i][j];
		    		
		    	}
		    }
		    for(int i=0;i<n;i++) {
		    	for(int j=0;j<m;j++) {
		    		System.out.println(aaa[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		}
	}


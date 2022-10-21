package com.src;
import java.util.Scanner;

public class Reversearray {
	public static void main(String[] args) {
		// TODO AUto generate method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a string");
		        String arr=sc.nextLine();
		        char a[]=arr.toCharArray();
		        
		
				System.out.println("reverse a string is");
				int i=a.length;
		        for(int j=i;j>0;j--) {
		        	System.out.println(a[j-1]);
		        }


}
}

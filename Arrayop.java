package com.ddkaa;

import java.util.Scanner;

public class Arrayop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the order of an array:");
			n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.print("Enter the "+i+" element:");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+" ");
			}
	}

}

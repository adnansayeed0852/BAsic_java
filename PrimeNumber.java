package com.ddkaa;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			f=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					f++;
				}
			}
			if(f==2)
				System.out.println(i+" is a Prime Number.");
			
		}
	}

}

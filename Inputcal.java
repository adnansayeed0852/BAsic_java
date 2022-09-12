package com.ddkaa;
import java.util.Scanner;
public class Inputcal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  1st number:");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		int s=n1+n2;
		int d=n2-n1;
		int p=n1*n2;
		int q=n1/n2;
		System.out.println("Sum -"+s);
		System.out.println("Diff -"+d);
		System.out.println("Mul -"+p);
		System.out.println("Div -"+q);
		
	}

}

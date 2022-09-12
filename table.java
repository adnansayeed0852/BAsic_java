package com.ddkaa;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter value-");
		int n= sc.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(i*n);
		}
	}

}

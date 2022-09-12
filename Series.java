package com.ddkaa;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		n=sc.nextInt();
		int i=1;
		//while(i<=n) {
				//System.out.println(i*i+" ");
				//i++;
//}
		/*for( int i=1;i<=n;i++) {
			System.out.println(i*i+" ");
		}*/
		do {
			System.out.println(i*i+" ");
			i++;
		}while(i<=n);
	}

}

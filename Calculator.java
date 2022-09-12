package com.ddkaa;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("Enter 1st Num");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd Num");
		int n2 = sc.nextInt();
		
		int Add = n1+n2;
		int Sub = n2-n1;
		int Mul = n1*n2;
		int Div = n1/n2;
		int Mod = n1%n2;
		System.out.println("Sum is - "+Add);
		System.out.println("Sub is - "+Sub);
		System.out.println("Mul is - "+Mul);
		System.out.println("Div is - "+Div);
		System.out.println("Mod is - "+Mod);

	}
}

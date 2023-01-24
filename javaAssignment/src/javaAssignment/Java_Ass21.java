package javaAssignment;

import java.util.Scanner;

public class Java_Ass21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n= sc.nextInt();
		System.out.println("The given number is "+((n%2==0)?"Even":"Odd"));
	}
}

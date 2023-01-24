package javaAssignment;

import java.util.Scanner;

public class Java_Ass16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x=sc.nextInt();
		System.out.println("Enter the Number up to which you want to print the tables:");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(x+"\t*\t"+i+"\t=\t"+i*x);
		}
	}
}

package javaAssignment;

import java.util.Scanner;

public class Java_Ass14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		System.out.println("The given year is "+((((year%400==0)||(year%100!=0))&&(year%4==0))?"Leap year":"Not a Leap year"));
	}
}

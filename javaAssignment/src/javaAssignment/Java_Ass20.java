package javaAssignment;

import java.util.Scanner;

public class Java_Ass20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int x=sc.nextInt(), y= sc.nextInt(),temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("The swapped numbers: "+x+"\t"+y);
	}
}

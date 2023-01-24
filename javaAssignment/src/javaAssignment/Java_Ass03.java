package javaAssignment;

import java.util.Scanner;

public class Java_Ass03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:");
		String x=sc.next(), reverse="";
		int length=x.length();
		for(int i=0;i<length;i++) {
			reverse=x.charAt(i)+reverse;
		}
		System.out.println("The reverse of the string is  "+reverse);
	}
}

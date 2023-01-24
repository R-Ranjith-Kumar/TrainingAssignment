package javaAssignment;

import java.util.Scanner;

public class Java_Ass24 {

	public static String reverse(String str) {
		if(str.length()==1) {
			return str;
		}
		else {
			return (reverse(str.substring(1))+str.charAt(0));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		String result=reverse(s);
		System.out.println("The reverse of the String is "+result);
	}
	
}

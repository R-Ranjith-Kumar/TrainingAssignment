package javaAssignment;

import java.util.Scanner;

public class Java_Ass07 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Character:");
		String s=sc.nextLine();
		char C=s.charAt(0);
		System.out.println(" String converted to Character:  " +C);
		String x="";
		x+=C;
		System.out.println(" Character converted to string:  "   +x);
	}
}

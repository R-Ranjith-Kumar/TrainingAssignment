package javaAssignment;

import java.util.Scanner;

public class Java_Ass15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character:");
		String s=sc.next();
		char c= s.charAt(0);
		System.out.println("The given char is a "+(((c>='a'&&c<='z')||(c>='A'&&c<='Z'))?"Character":"Not a Character"));
	}
}

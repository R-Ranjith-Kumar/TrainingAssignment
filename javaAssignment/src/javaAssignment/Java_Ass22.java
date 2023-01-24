package javaAssignment;

import java.util.Scanner;

public class Java_Ass22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s= sc.nextLine();
		s=s.toLowerCase();
		System.out.println("Enter the character that you want to find the frequency:");
		String c=sc.next();
		c=c.toLowerCase();
		int ans=0;
		for(int i=0;i<s.length();i++) {
			if(c.charAt(0)==s.charAt(i))
				ans++;
		}
		System.out.println("The frequency of the character \""+c.charAt(0)+"\" is "+ans);
	}
}

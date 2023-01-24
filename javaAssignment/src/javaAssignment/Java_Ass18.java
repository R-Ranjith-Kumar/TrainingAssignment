package javaAssignment;

import java.util.Scanner;

public class Java_Ass18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s= sc.nextLine();
		int length= s.length(),vowels=0,consonants=0;
		for(int i=0;i<length;i++) {
			if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.println("Number of vowels: "+vowels+"\nNumber of consonants: "+consonants);
	}
}

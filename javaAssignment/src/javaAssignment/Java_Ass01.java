package javaAssignment;

import java.util.Scanner;

public class Java_Ass01 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		boolean ans=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				ans= false;
				break;
			}
		}
		System.out.println((ans)?"Prime Number":"Not a Prime Number");
	}
}

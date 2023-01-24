package javaAssignment;

import java.util.Scanner;

public class Java_Ass02 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		int a=-1,b=1,ans;
		for(int i=0;i<n;i++) {
			ans=a+b;
			a=b;
			b=ans;
			System.out.println(ans);
		}
	}
}

package javaAssignment;

import java.util.Scanner;

public class Java_Ass08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the Numbers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value:");
		int x=sc.nextInt();
		boolean ans=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				ans=true;
				break;
			}
		}
		System.out.println("The number is "+((ans)?"Present":"Absent"));
	}
}

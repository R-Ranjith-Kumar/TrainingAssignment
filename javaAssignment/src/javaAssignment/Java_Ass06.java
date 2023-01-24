package javaAssignment;

import java.util.Scanner;

public class Java_Ass06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of 1st array:");
		int m=sc.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter the values of 1st array:");
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.print("Enter the size of 2nd array:");
		int n=sc.nextInt();
		int arr2[]=new int[n];
		int ans[]=new int[m+n];
		System.out.println("Enter the values of 2nd array:");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			ans[i]=arr1[i];
		}
		for(int i=0;i<n;i++) {
			ans[m+i]=arr2[i];
		}
		System.out.println("Concantenated array:");
		for(int i=0;i<m+n;i++)
			System.out.println(ans[i]);
	}
}

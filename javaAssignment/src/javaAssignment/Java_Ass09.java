package javaAssignment;

import java.util.Scanner;

public class Java_Ass09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n],ans;
		System.out.print("Enter the Numbers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ans=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		System.out.println("The largest of the array is "+ans);
	}

}

package javaAssignment;

import java.util.Scanner;

public class Java_Ass05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number of rows:");
		int m=sc.nextInt();
		System.out.print("Enter the Number of columns:");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int ans[][]=new int[m][n];
		System.out.println("Enter the values of 1st matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				ans[i][j]+=a[i][j];
			}
		}
		System.out.println("Enter the values of 2nd matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
				ans[i][j]+=b[i][j];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ans[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

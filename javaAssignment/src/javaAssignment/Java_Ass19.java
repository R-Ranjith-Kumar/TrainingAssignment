package javaAssignment;

import java.util.Scanner;

public class Java_Ass19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the height:");
		int x= sc.nextInt();
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=x-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

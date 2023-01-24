package javaAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Ass10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of 1st list:");
		int m=sc.nextInt();
		List<Integer> list1=new ArrayList<Integer>();
		System.out.println("Enter the values of 1st list");
		for(int i=0;i<m;i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("First list:"+ list1);
		System.out.print("Enter the size of 2nd list:");
		int n=sc.nextInt();
		List<Integer> list2=new ArrayList<Integer>();
		System.out.println("Enter the values of 2nd list");
		for(int i=0;i<n;i++) {
			list2.add(sc.nextInt());
		}
		System.out.println("Second list"+list2);
		List<Integer> joined=new ArrayList<Integer>();
		joined.addAll(list1);
		joined.addAll(list2);
		System.out.println("Joined list:" +joined);
	}

}

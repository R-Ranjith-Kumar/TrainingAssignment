package javaAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java_Ass11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int n = sc.nextInt();
		List<String> list1 = new ArrayList<String>();
		System.out.println("Enter the list elements");
		for (int i = 0; i < n; i++) {
			list1.add(sc.next());
		}
		String arr[] = list1.toArray(new String[n]);
		System.out.println("Here is the array: " + Arrays.toString(arr));
		List<String> list2 = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			list2.add(arr[i]);
		}
		System.out.println("Here is the list: "+list2 );
	}
}

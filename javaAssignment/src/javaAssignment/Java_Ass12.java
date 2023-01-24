package javaAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Java_Ass12 {

	public static void main(String[] args) {
		HashMap<Integer, String> fruits= new HashMap<>();
		fruits.put(1,"Mango");
		fruits.put(2,"Apple");
		fruits.put(3,"Orange");
		fruits.put(4,"Banana");
		fruits.put(5,"Guava");
		for(Map.Entry m:fruits.entrySet()) {
			System.out.println(m.getKey()+ "  "+m.getValue());
		}
		List<Integer> fruitKeys= new ArrayList(fruits.keySet());
		List<String> fruitsValues= new ArrayList(fruits.entrySet());
		System.out.println(fruitsValues);
	}
}

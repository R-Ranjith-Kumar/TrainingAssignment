package javaAssignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Java_Ass13 {

	public static void main(String[] args) {
		Map<Integer,String> a=new HashMap<Integer,String>();
        a.put(1,"Ranjith");
        a.put(2,"Arun");
        a.put(3,"Mukesh Kumar");
        a.put(4,"Gadiraju");
        LinkedHashMap<Integer,String> b=new LinkedHashMap<Integer,String>();
        a.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->b.put(x.getKey(),x.getValue()));
        System.out.println("Sorted hash map");
        System.out.println(b);
	}
}

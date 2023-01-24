package javaAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_Ass23 {

	public static void main(String[] args) throws ParseException {
		String s="31/12/22";
		Date date=new SimpleDateFormat("dd/MM/yy").parse(s);
		System.out.println(s+"\t"+date);
	}

}

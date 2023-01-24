package javaAssignment;

interface inter {
	public void interMessage();
}

class class1 implements inter{

	class1(){
		
	}
	public void interMessage() {
		System.out.println("The interface is implemented in this class1.");
	}
}
public class Java_Ass25 {

	public static void main(String[] args) {
		class1 a= new class1();
		a.interMessage();
	}
}

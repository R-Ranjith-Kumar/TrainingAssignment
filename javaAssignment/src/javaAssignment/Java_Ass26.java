package javaAssignment;

class Parent{
	Parent(){
		
	}
	public void printParent() {
		System.out.println("This message is from parent class:");
	}
}

class Child extends Parent{
	Child(){
		
	}
	public void printChild() {
		System.out.println("This message is from the child class:");
	}
}
public class Java_Ass26 {

	public static void main(String[] args) {
		Child a= new Child();
		a.printChild();
		a.printParent();
	}
}

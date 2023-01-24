package javaAssignment;

abstract class Parent4{
	abstract void exercise();
}

class Child4 extends Parent4
{
	void exercise()
	{
		System.out.println("Child can crawl");
	}
}
public class Java_Ass31 {

	public static void main(String[] args) {
		Parent4 a= new Child4();
		a.exercise();
	}
}

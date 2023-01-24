package javaAssignment;

class parent1 {
	void walking()
	{
		System.out.println("I am walking");
	}

	public void running() {
		// TODO Auto-generated method stub
		
	}
}

class child1 extends parent1
{
	
	public void running()
	{
		System.out.println("I am Running");
	}
}
public class Java_Ass27 {

	public static void main(String[] args) {
		parent1 a=new child1();
		
		a.running();
	}
}

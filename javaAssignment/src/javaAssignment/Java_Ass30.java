package javaAssignment;
class Vehicle3
{
	void drive()
	{
		System.out.println("All cars are vehicles");
	}
}

class Car3 extends Vehicle3
{
	void drive()
	{
		super.drive();
		System.out.println("All vehicles are not cars");
	}
}

public class Java_Ass30 {

	public static void main(String[] args) {
		Vehicle3 a= new Car3();
		a.drive();
	}
}

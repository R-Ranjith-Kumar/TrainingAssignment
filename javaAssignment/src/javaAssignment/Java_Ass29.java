package javaAssignment;

class Vehicle2
{
	public void vehicle()
	{
		System.out.println("All cars are Vehicles");
	}
}

class Car2 extends Vehicle2
{
	public void vehicle()
	{
		System.out.println("All Vehicles are not cars");
	}
	
}
public class Java_Ass29 {

	public static void main(String[] args) {
		Vehicle2 a= new Car2();
		a.vehicle();
	}
}

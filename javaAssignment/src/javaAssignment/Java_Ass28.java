package javaAssignment;

interface Bike{
	public void bike();
}

interface Car{
	public void car();
}

class Vehicle implements Bike,Car
{
	public void bike()
	{
		System.out.println("I ride the bike");
	}
	
	public void car()
	{
		System.out.println("I drive the car");
	}
}
public class Java_Ass28 {

	public static void main(String[] args) {
		Vehicle a=new Vehicle();
		a.car();
		a.bike();
	}
}

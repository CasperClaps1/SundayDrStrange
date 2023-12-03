package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		System.out.println("My Car has 4 door");
		
	}

	@Override
	public void iWheel() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 wheel");
		
	}

	@Override
	public void iEngine() {
		// TODO Auto-generated method stub
		System.out.println("My car has 2 engine");
		
	}

	@Override
	public int iSail() {
		// TODO Auto-generated method stub
		System.out.println("My boat has 1 sail");
		
		return 1;
	}

	@Override
	public String iCabin() {
		// TODO Auto-generated method stub
		System.out.println("My boat has AC cabin");
		return "AC";
	}

}

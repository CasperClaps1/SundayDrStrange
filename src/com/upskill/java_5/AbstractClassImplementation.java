package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		// 
		System.out.println("My car has 4 door");
	}

	@Override
	public void iwheel() {
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
	/*
	 (Parent)                   (Keyword)             (Child)       (Keyword)       (GrandChild)
	 Class [R]                   extends              Class[R]
	 Abstract class[R][i]        extends             Class[R][R]   
	 Interface [i]               extends             Class[R]
	 Interface [i]               extends             Interface[i][i]      implements       Class [R][R]

*/


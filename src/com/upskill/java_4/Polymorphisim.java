package com.upskill.java_4;

public class Polymorphism extends MethodType{
	

/*Polymorphism is the ability of an object to take on many forms.
 -Method Overloading (compile time polymorphismn/static binding)Same method name with different signature to overload 
 -Method Overriding (Runtime Polymorphismn/dynamic binding same method name from Parent class to override
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Polymorphism obj = new Polymorphism ();
 obj.annualIncomeVoid();
	
 
	}
// Method overloading-Compile time Polymorphism -Static binding
// Same method name with different signature

	public void annualIncomeVoid(){
		int pastAnnualIncome = 13000;
		int rentalIncome = 18000;
		int sideIncome = 15000;
		int bonus = 25000;
		int newIncome = pastAnnualIncome + rentalIncome + sideIncome + bonus;
		System.out.println("My Annual Income = " + newIncome );
		
	}
	
public static void car(){
	System.out.println("my car is Tesla");
	
}
	public static void car(String color){
	System.out.println("My car is a Tesla,Its color is" + color);
	}

	public static void car(String color, int seat){
		System.out.println("My car is Tesla,it s collor is " + color +",It has seat" + seat);
		
	}
	public static void car (int door){
		System.out.println("My car is Tesla,its has door " + door);
	}
		
		
	}		
	

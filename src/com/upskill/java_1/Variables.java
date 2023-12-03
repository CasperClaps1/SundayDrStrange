package com.upskill.java_1;

public class Variables {

  
	 //Variables in Java
	
	//Instance QR global variable - Variables declared in Class level,outside method
	
	//Static variable - variables belong to class and don't require creating object
	
	//Local variable -variables declared in methods
	
	//Method parameter - variable used as method parameter
	
	public static void main(String[] args) {
		
		Variables obj = new Variables();
		obj.newyork();
		obj.texas("Steak");
	    System.out.println(obj.country);
		System.out.println(obj.president);
		
		
		
	}      
	String country = "USA";           //Instance OR global variable - Variables declared in class level 
	  String president = "Biden";
	  
	
     public static void  newyork(){
    	 
    	 String city = "queens";   // Local variable - variable declared in method
    	 String police ="NYPD";
    	 System.out.println(police);
    	 
     }

      public static void texas(String food){           //Method parameter - variables used as method parameter
    	  String city = "Austin";
    	  String police = "APD";
    	  System.out.println(police);
    	  System.out.println(food);
    	  
    	  
      }
}
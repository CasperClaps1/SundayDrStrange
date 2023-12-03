package com.upskill.java_1;

public class MethodType {
   
	/*  Types of Methods
	 1.Void method
	 2.Satic method
	 3.return type method
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodType obj = new MethodType();
      obj.annualIncomeVoid();
      
      weeklyIncomeStatic();
      
      System.out.println("My Monthly Income + " + obj.monthlyIncomeReturn());
       
	}
      static int hourLyIncome =95;
    	//void method
    	public void annualIncomeVoid(){
    	  int calculateAnnualIncome = hourLyIncome * 2000;
    	  System.out.println("My Annual Income = " +calculateAnnualIncome);
    	  
      }  //ststic method
      public static void weeklyIncomeStatic(){
    	  int calcualteweeklyIncome = hourLyIncome * 40;
    	 System.out.println("My Weekly Income = " + calcualteweeklyIncome);
    	  
      } 
      //return type method
      public int monthlyIncomeReturn(){
    	  int calculateMonthlyIncome = hourLyIncome * 180;
    	  return calculateMonthlyIncome;
      }
    	 public static String name(){
    		  return "Vlad";
    		  
    				 
    		  
    	  }
    	  
    	  
      
}

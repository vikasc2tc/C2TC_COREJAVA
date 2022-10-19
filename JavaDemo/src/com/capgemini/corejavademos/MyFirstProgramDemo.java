// This program will demonstrate use of variables and basic output
package com.capgemini.corejavademos;
public class MyFirstProgramDemo 
{	
	// Data Members
	 private int firstNumber = 100;  
	String firstName = "Vikas"; 
	float secondNumber = 10.0f; 
	float addNumber = firstNumber + secondNumber; 
	// Member methods
	private void displayOutput() 
	{
	System.out.println("Hello COET Students");
	
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyFirstProgramDemo obj = new MyFirstProgramDemo();
		obj.displayOutput();
	}
}

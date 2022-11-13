package Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) //Main Method 
	{
		System.out.println("==========Arithmetic Operations========"); 
		 
		double n1,n2,choice,calculate;//initializing the variables 
		Scanner Aman = new Scanner(System.in);//Scanner class is build up library for user input  and Aman is just object of Scanner class
		System.out.println("Enter First Number :"); //for printing first number on console application
		n1 =Aman.nextDouble(); // passing input from user-end
		System.out.println("Enter Second Number :"); 
		n2 =Aman.nextDouble(); 
		System.out.println("Select Operation :"); 
		choice=Aman.nextDouble(); //passing choice variable as a condition and printing integer value by nextInt() method
		 
		if(choice==1) 
		{ 
			calculate =n1+n2; //Addition
		System.out.println("Addition :"+calculate); 
		 
		} 
		else if(choice==2) 
		{ 
			calculate =n1-n2;//Subtraction 
		System.out.println("Subtractionn:"+calculate); 
		} 
		else if(choice==3) 
		{ 
			calculate =n1*n2;//Multiplication
		System.out.println("mutiplication :"+calculate); 
		} 
		else if(choice==4) 
		{ 
			calculate =n1/n2;//Division 
		System.out.println("Division :"+calculate); 
		} 
		else { 
			calculate =n1%n2;//Modulation for Remainder value
		System.out.println("Remainder :"+calculate);
		}
	}
}
	



package pkgMain;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

// Vincent Sargeni Aiden Sharkey Eric Rowe
//Using the Lab_1_helper off Prof Gibbons Github
public class cMain {

	public static void main(String[] args) {
		calc();
	}

	public static void calc() {
		/*
		 * Calc() is a method that takes in no parameters and returns nothing
		 * it calculates the amount you need to save per month and the amount you need saved total
		 */
		
		//get user input
		System.out.print("Enter Years worked:"); // ask the question
		Scanner intakeYears = new Scanner(System.in); // assign to intakeYears
		double y1 = intakeYears.nextDouble(); // y1 is now a double
		
		System.out.print("Enter annual return (0-20):");// ask the question
		Scanner intakeReturn = new Scanner(System.in);// assign to intakeReturn
		double ar1 = intakeReturn.nextDouble(); // ar1 is now a double
		
		System.out.print("Enter Years retired:");// ask the question
		Scanner intakeRetire = new Scanner(System.in);// assign to intakeRetire
		double yr = intakeRetire.nextDouble();// yr is now a double
		
		System.out.print("Enter annual return after retirement (0-3):");// ask the question
		Scanner intakeReturn2 = new Scanner(System.in);// assign to intakeReturn2
		double ar2 = intakeReturn2.nextDouble(); // ar2 is now a double
		
		System.out.print("Enter required income:");// ask the question
		Scanner RecIn = new Scanner(System.in);// assign to RecIn
		double RIn = RecIn.nextDouble();// RIn is now a double
		
		System.out.print("Enter SSI:"); //ask the question
		Scanner SSIin = new Scanner(System.in);// assign to SSIin
		double SSI = SSIin.nextDouble(); // SSI is now a double
		
		//format the user input values for the methods
		double a =(ar1/100)/12; // % by months
		double b= (y1*12);		//convert to months
		double r = (ar2/100)/12; //% by months
		double n = yr * 12; //convert from years to months
		double y = RIn-SSI; // differenct between the income and SS benefits dispursed 
		double f = 0; // final amount should be 0
		boolean t = false;	// we want the # at the beginning of the investments  	
		
		//input user values into the appropriate methods 
		double pv = FindPV(r, n, y, f, t); //Calculate the total you need to save
		double pmt = FindPMT(a, b, 0, pv, t); //Calculate the total you need to save per month
		
		System.out.println(); //I prefer a space between the inputs and the outputs
		
		//print out the results of the methods
		System.out.printf("The amount to save per month is $%.2f  \n",pmt); //format to show cents 
		
		System.out.printf("The total you need saved is $%.2f ",pv*-1); // format to show cents
		
		// close the scanners
		intakeYears.close();
		intakeReturn.close();
		intakeRetire.close();
		intakeReturn2.close();
		RecIn.close();
		SSIin.close();
		
		

	}
	// define the other methods
	public static double FindPMT(double r, double n, double p, double f, boolean t) {
		return FinanceLib.pmt(r, n, p, f, t);
	}

	public static double FindFV(double r, double n, double y, double p, boolean t) {
		return FinanceLib.fv(r, n, y, p, t);
	}

	public static double FindPV(double r, double n, double y, double f, boolean t) {
		return FinanceLib.pv(r, n, y, f, t);
	}

}

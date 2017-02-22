package pkgMain;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.*;
// Vincent Sargeni Aiden Sharkey Eric Rowe
//Using the Lab_1_helper off Prof Gibbons Github
public class cMain {

	public static void main(String[] args) {

	}

	public static void calc() {
		System.out.print("Enter Years worked:"); // ask the question
		Scanner intakeYears = new Scanner(System.in); // assign to intakeYears
		double y1 = intakeYears.nextDouble(); // y1 is now a double
		
		System.out.print("Enter annual return (0-20%):");
		Scanner intakeReturn = new Scanner(System.in);
		double ar1 = intakeReturn.nextDouble();
		
		System.out.print("Enter Years retired:");
		Scanner intakeRetire = new Scanner(System.in);
		double yr = intakeRetire.nextDouble();
		
		System.out.print("Enter annual return after retirement (0-3%):");
		Scanner intakeReturn2 = new Scanner(System.in);
		double ar2 = intakeReturn2.nextDouble();
		
		System.out.print("Enter required income:");
		Scanner RecIn = new Scanner(System.in);
		double RIn = RecIn.nextDouble();
		
		System.out.print("Enter SSI:");
		Scanner SSIin = new Scanner(System.in);
		double SSI = SSIin.nextDouble();
		
		System.out.println(FindPMT(ar1,yr,));

	}

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

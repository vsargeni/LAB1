package pkgMain;

import org.apache.poi.ss.formula.functions.*;

public class cMain {

	public static void main(String[] args) {

	}
	
	public static double FindPMT(double r, double n, double p, double f, boolean t)
	{
		return FinanceLib.pmt(r, n, p, f, t);
	}
	
	public static double FindFV(double r, double n, double y, double p, boolean t)
	{
		return FinanceLib.fv(r, n, y, p, t);
	}
	
	public static double FindPV(double r, double n, double y, double f, boolean t)
	{
		return FinanceLib.pv(r, n, y, f, t);
	}

}

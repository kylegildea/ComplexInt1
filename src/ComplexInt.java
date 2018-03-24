import java.util.ArrayList;

public class ComplexInt 
{
	int caseGiven;
	int bigFac = 0;
	int smallFac = 0;
	int sum;
	ArrayList<Integer> factors = new ArrayList();
		
	public ComplexInt(int caseGiven) 
	{
		super();
		setCaseGiven(caseGiven);
	}
	public int getCaseGiven() 
	{
		return caseGiven;
	}
	public void setCaseGiven(int caseGiven) 
	{
		this.caseGiven = caseGiven;
	}
	public ArrayList<Integer> getFactors() 
	{
		return factors;
	}
	public void setFactors() 
	{
		this.factors = checkForFactors();
	}
	
	public int getBigFac() 
	{
		return bigFac;
	}
	public void setBigFac(int bigFac) 
	{
		this.bigFac = bigFac;
	}
	public int getSmallFac() 
	{
		return smallFac;
	}
	public void setSmallFac(int smallFac) 
	{
		this.smallFac = smallFac;
	}
	
	public int getSum() 
	{
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String toString()
	{
		return getCaseGiven() + " " + getFactors().toString();
	}
	private ArrayList<Integer> checkForFactors() 
	{
		int squareRootPlusOne = (int) (Math.sqrt(getCaseGiven()) + 1);
		ArrayList<Integer> fac = new ArrayList<Integer>();
		for(int i = 1; i < squareRootPlusOne; i++)
		{
			if(getCaseGiven() % i == 0 && ((getBigFac() == 0 && getSmallFac() == 0) || (i + (getCaseGiven() / i) < (getBigFac() + getSmallFac()))))
			{
				setSmallFac(i);
				setBigFac(getCaseGiven() / i);
				setSum((getSmallFac() + getBigFac()));
			}
		}
		return fac;
	}
}

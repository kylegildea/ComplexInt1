import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given a number A, find the smallest possible value of B+C, if B*C = A. Here A, B, and C must all be positive integers. It's okay to use brute force by checking every possible value of B and C. You don't need to handle inputs larger than six digits. Post the return value for A = 345678 along with your solution.

For instance, given A = 12345 you should return 838. Here's why. There are four different ways to represent 12345 as the product of two positive integers:

12345 = 1*12345
12345 = 3*4115
12345 = 5*2469
12345 = 15*823
The sum of the two factors in each case is:

1*12345 => 1+12345 = 12346
3*4115 => 3+4155 = 4158
5*2469 => 5+2469 = 2474
15*823 => 15+823 = 838
The smallest sum of a pair of factors in this case is 838.
 * 
 */
public class MainCIDriver 
{

	public static void main(String[] args) 
	{
		int i = 0;
		ArrayList<ComplexInt> allCases = new ArrayList<ComplexInt>();
		while(i < args.length && args.length > 0)
		{
			allCases.add(new ComplexInt(Integer.parseInt(args[i])));
			i++;
		}
		for(i = 0; i < allCases.size(); i++)
		{
			allCases.get(i).setFactors();
		}
		for(i = 0; i < allCases.size(); i++)
		{
			System.out.println("For " + allCases.get(i).getCaseGiven() + " the smallest sum of two factors is: " + allCases.get(i).getSmallFac()
					+ " + " + allCases.get(i).getBigFac() + " = "+ allCases.get(i).getSum());
		}
				
		System.exit(0);
	}	
}

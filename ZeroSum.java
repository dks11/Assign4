import java.util.Scanner;

/**
This class see if an array has a subset which sums to 0
@author Dakota Staples
 */
public class ZeroSum
{
	public static void main(String[] args)
	{
		System.out.println("Please enter 3 integers");
		Scanner stdin = new Scanner(System.in);
	
		int[] list = new int[3];
		for (int i = 0; i < list.length; i++)
		{
			list[i] = stdin.nextInt();
		}

		System.out.println("The array has a subset which sums to zero: " + zeroSum(list));
	}
	
	/**
	This is the method which calls the helper method
	@param a the array to check
	@return whether it contains it or not
	*/
	public static boolean zeroSum(int[] a)
	{
		return helper(a, a.length, 0);
	}
	
	/**
	This is the method which checks whether it zero sums or not
	@param a The array to check
	@param i the length of the array and is used for subsetting
	@param sum the sum each time
	@return whether it zero sums or not
	*/
	public static boolean helper(int[] a, int i, int sum)
	{
		boolean bool1 = true; 
		boolean bool2 = true;
		
		if (i == 0)
		{
			return false;
		}

		if(sum - a[i-1] == 0)
		{
			return true;
		}

		if ( (i > 0) && (sum - a[i-1] != 0) )
		{
			System.out.println("This is the sum " + (sum - a[i-1])  );

			bool1 = helper(a,i-1,sum);
			
			if(bool1)
			{
				return bool1;
			}
			
			
		    bool2  = helper(a,i-1,sum - a[i-1]);
			
			if(bool2)
			{
				return bool2;
			}
		}

 		return (bool1 || bool2);
	}
}

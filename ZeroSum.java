import java.util.Scanner;
public class ZeroSum
{
	public static void main(String[] args)
	{
		System.out.println("Please enter 5 integers");
		Scanner stdin = new Scanner(System.in);
	
		int[] list = new int[5];
		for (int i = 0; i < list.length; i++)
		{
			list[i] = stdin.nextInt();
		}

		System.out.println("The array has a subset which sums to zero: " + zeroSum(list));
	}
	
	public static boolean zeroSum(int[] a)
	{
		return helper(a, a.length, 0);
	}

	public static boolean helper(int[] a, int i, int sum)
	{
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
			sum += a[i-1];
			return helper(a,i-1,sum);
		}
		
		if ( (i > 0) && (sum-a[i-1] != 0) )
		{
			sum += a[i-1];
			return helper(a,i-1,sum - a[i-1]);
		}

 		return true;
	}
}

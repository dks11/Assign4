import java.io.*;
import java.util.Scanner;
public class River
{
	private static int sum = 0;
	public static void main(String[] args)
	{
		Scanner stdin;
		BufferedReader br;
		FileReader fileIn;
		try
		{	
			fileIn = new FileReader(args[0]);
			br = new BufferedReader(fileIn);
			stdin = new Scanner(br);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			return;
		}

		int row = stdin.nextInt();
		int col = stdin.nextInt();
		int start = stdin.nextInt();
		int[][] list = new int[row][col];

		for(int i=0; i<row; i++)
      		{
           		for(int j=0; j<col; j++)
           		{
               			list[i][j] = stdin.nextInt();
           		}
       		}

		System.out.println("The Size Of the River is " + find0(list,0,start));

       		for(int i=0; i<row; i++)
       		{
           		for(int j=0; j<col; j++)
           		{
               			System.out.print(list[i][j]+ "  ");
           		}
           		System.out.println();
		}
	}
	
	private static int find0(int[][] list,int r,int c)
	{
		boolean done = false;
		list[r][c] = 7;
		
		if( (r-1 >=0 && list[r-1][c] > 0) && (r+1 <= list.length && list[r+1][c] > 0) && (c-1 >= 0 && list[r][c-1] > 0)
			&& (c+1 <= list[r].length && list[r][c+1] > 0) )
		{
			return sum + 1;
		}
	
		if(r-1 >=0 && list[r-1][c] == 0)
		{
			return sum + River.find0(list, r-1, c);
		}
	
		if(r+1 <= list.length && list[r+1][c] == 0)
		{
			return sum + River.find0(list, r+1, c);
		}
	
		if(c-1 >= 0 && list[r][c-1] == 0)
		{
			return sum + River.find0(list, r, c-1);
		}
	
		if(c+1 <= list[r].length && list[r][c+1] == 0)
		{
			return sum + River.find0(list, r, c+1);
		}
		return sum;
	}
}	

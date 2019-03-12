public class River
{
	private static int sum = 0;
	public static void main(String[] args)
	{
		
	}
	
	private static int find0(int[][] list,int r,int c)
	{
		boolean done = false;
		list[r][c] = 7;
		
	if()
	{
		return 1;
	}
	
	if(r-1 >=0 && list[r-1][c] == 0)
	{
		return River.find0(list, r-1, c);
	}
	
	if(r+1 <= list.length && list[r+1][c] == 0)
	{
		return River.find0(list, r+1, c);
	}
	
	if(c-1 >= 0 && list[r][c-1] == 0)
	{
		return River.find0(list, r, c-1);
	}
	
	if(c+1 <= list[r].length && list[r][c+1] == 0)
	{
		return River.find0(list, r, c+1);
	}
	
	private static int change0(int[][] list,r,c)
	{
		list[r][c] = 7;
	}
}	
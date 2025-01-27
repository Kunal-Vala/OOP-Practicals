import java.util.*;

class Practical1_11{

	public static void main(String []ar)
	{
		Scanner cin = new Scanner(System.in);
		System.out.println("Pattern 1:");
		for(int i=0;i<4;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 2:");
		
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("Pattern 3:");
		int num=1;
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

		cin.close();

	}
}

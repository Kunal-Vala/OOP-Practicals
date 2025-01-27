import java.util.*;

class Practical1_9{

	public static void main(String []arg)

	{
		int num;
		int temp = 1;
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter Five Digit Number : ");
		num = cin.nextInt();
		
		for(int i =1;i<=5;i++)
		{

			num = num+temp;
			temp = temp*10;
		}

		System.out.print("Ans is : "+ num);
			
	}

}
import java.util.*;
class Practical1_5{


	public static void main(String a[])
	{
	Scanner cin = new Scanner(System.in);
	
	int arr[] = new int[3];
	System.out.print("Enter three numbers : ");
	arr[0] = cin.nextInt();
	arr[1] = cin.nextInt();
	arr[2] = cin.nextInt();
	
	Arrays.sort(arr);
	for(int i=2;i>=0;i--)
	{
		System.out.println(arr[i]);

	}
	

	}

}
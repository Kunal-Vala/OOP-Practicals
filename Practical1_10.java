import java.util.*;

class Practical1_10{

	public static void main(String []ar)
	{
		Scanner cin = new Scanner(System.in);
		
		double side1,side2,side3,area,semip;
	
		System.out.println("Enter Sides of Triangle :");		
		side1 = cin.nextDouble();
		side2 = cin.nextDouble();
		side3 = cin.nextDouble();

		semip = (side1+side2+side3)/2;
		area = Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3));

		String formattedArea = String.format("%.2f", area);
		System.out.print("Area = "+formattedArea);

		cin.close();

	}
}

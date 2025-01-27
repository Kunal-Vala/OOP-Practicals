import java.util.*;
class Practical1_6{

	public static void main(String a[])
	{

	Scanner cin = new Scanner(System.in);
	char chr;
	
	System.out.print("Enter the character :");
	chr = cin.next().charAt(0);
	
	if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
	{	
		System.out.print("Your Character is a Vowel");
	}
	else
	{
		System.out.print("Your Character is a Consonant");
	}


	}
}
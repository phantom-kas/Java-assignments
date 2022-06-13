import java.util.Scanner;


public class Leapyear_Checker {
	
	static Scanner input = new Scanner(System.in);
	public static  float isLeapYear(float a)
	{
		if(a == -1)
		{return -1; }
		else if (a < -1 )
		{return -2;}
		else if(a%4 == 0)
		{return 1;}
		else
		{
			return 0;
		}
	}		 
	public static void main(String args[])
	{
		System.out.print("   \t********************\n      \t Leap Year Checker \n          \t203j11 \n   \t********************\n\n");
		System.out.print("please Enter year");

		float b = input.nextFloat();
		float y = isLeapYear(b);
		while(y != -1) 
		{ 
			if(y <-1)
			{System.out.print("please Enter a valid number !! \nor enter -1 to exit");
			System.out.print("*Please enter year");
			float c = input.nextFloat();
			y = isLeapYear(c);
			continue;
			}
			else if(y == 1)
			{
				System.out.print((int) b+" is a leap year. ");
				break;
			}
			else if(y == 0)
			{
				System.out.print((int) b+" is not a leap year. ");
				break;
			}
		}
		System.out.print( "\n exiting...... ");

	}
}
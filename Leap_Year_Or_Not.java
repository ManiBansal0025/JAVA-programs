/*Write a program to check if a year is leap year or not.*/
import java.io.*;
class  year
{
	public static void main(String[] args)throws IOException
	{
		int year;
		System.out.println("Enter the year");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		year = Integer.parseInt(br.readLine());
		if (year%4 == 0)
		{
			System.out.println("Leap year");
			if (year%400 == 0)
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("not a leap year");
		}
	}
}

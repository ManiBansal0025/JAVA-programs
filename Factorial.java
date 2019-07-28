/*Write a Java program to calculate factorial of a number.*/
import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,sum = 1;
		num = sc.nextInt();
		for(int i =1; i<=num;i++)
		{
			sum = sum*i;
		}
		System.out.println("Factorial of number is   "+sum);
	}
}

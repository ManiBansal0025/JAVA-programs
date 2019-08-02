/*Write a program in java to find the sum of the even 
and odd digits of the number which is given as input.*/
import java.util.Scanner;
class  soe
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,m,even = 0,odd = 0;
		System.out.println("enter the limit");
		m = sc.nextInt();
		System.out.println("enter the numbers");
		for(int i=1;i<=m;i++)
		{
			n = sc.nextInt();
			if (n%2==0)
			{
				even = even+n;
			}
			else
			{
				odd = odd+n;
			}
		}
		System.out.println("Sum of even no." +even);
		System.out.println("Sum of odd no." +odd);
	}
}

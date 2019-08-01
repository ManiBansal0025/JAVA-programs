import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num,r,s = 0,p;
		num = sc.nextInt();
		p = num;
		while(num>0 )
		{
			r = num%10;
			s = s+r*r*r;
			num = num/10;
		}
		if (s == p)
		{
		System.out.println("Armstrong no.");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}

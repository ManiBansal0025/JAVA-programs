import java.util.Scanner;
class  Answer
{
	void product()
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Product of 2 no. " + (a*b));
	}
	public static void main(String[] args) 
	{
		Answer ans = new Answer();
		ans.product();
	}
}

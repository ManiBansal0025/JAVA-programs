/*(Lowest terms examples 3/12 = 1/4)*/
import java.util.Scanner;
class fraction
{
public static void main(String args[])
{
int num,den,gcd;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a numerator");
num = sc.nextInt();    //3
System.out.println("Enter a denomenator");
den = sc.nextInt();      //12
if(num>den)
{ 
	gcd = den;
	}
	else
	{
	gcd = num;
	}
System.out.println("Lowest form : " + num/gcd + "/" + den/gcd );
}
}

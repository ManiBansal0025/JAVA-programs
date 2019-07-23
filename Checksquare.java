/*Take values of length and breadth of a rectangle from user and check if it is square or not*/
import java.util.Scanner;
class Checksquare
{
public static void main(String args[])
{
int l,b;
Scanner sc = new Scanner(System.in);

System.out.println("Enter length");
l = sc.nextInt();

System.out.println("enter breadth");
b = sc.nextInt();

if (l==b)
{
System.out.println("Square");
}

else
{
System.out.println("Not Square");
}

}
}

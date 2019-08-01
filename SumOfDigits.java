/*Calculate the sum of digits of a number given by user. E.g.-
INUPT : 123        OUPUT : 6
INUPT : 12345        OUPUT : 15*/
import java.util.Scanner;
class sod
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num,sum = 0,r;
num = sc.nextInt();
while(num>0)
{
r = num%10;
sum = sum+r;
num = num/10;
}
System.out.println(sum);
}
}


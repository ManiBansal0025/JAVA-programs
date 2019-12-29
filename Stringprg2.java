/*Write a program to find the length of the string 
and also check if the letter 'e' is present.*/
class ref
{
public static void main(String args[])
{
String s = "manibansa";
int a = s.length();
for (int i = 0;i<=a ;i++ )
{
if (s.charAt(i)=='e')
{
	System.out.println("letter is present");
	break;
}
}
System.out.println(s.length());
}
}

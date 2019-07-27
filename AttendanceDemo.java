/*A student will not be allowed to sit in exam 
if his/her attendence is less than 75%.*/
import java.io.*;
class  attendance
{
	public static void main(String[] args)throws IOException 
	{
		float held,attented,total;
		char var;
		System.out.println("Enter the no. of classes held and attented");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		held = Integer.parseInt(br.readLine());
		attented = Integer.parseInt(br.readLine());
		total = attented/held*100;
		System.out.println("The total % of attendance "+ total);
		System.out.println("Enter the medical cause y or n");
		var = (char)br.read();
		if (total<75)
		{
			switch (var)
			{
			case 'y':
				System.out.println("student is ill");
				break;
			case 'n':
					System.out.println("Student is not ill");
					break;
			default:
						System.out.println("Wrong choice");
			}
		}
		else
		{
			System.out.println("Student is  allowed to sit in exam");
		}
	}
}

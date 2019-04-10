import java.util.Scanner;
class Percentage
{
	public static void main(String []arges)
	{
		int p;

		Scanner scan =new Scanner(System.in);
		System.out.println("enter the percentage : ");
		p=scan.nextInt();
 		
		if(p>=75)
		System.out.println("first class with division");

		else if(p>=60)
		System.out.println("first class ");

		else if(p>=50)
		System.out.println("second class");

		else if(p<=40)
		System.out.println("Third Class");
		
		else if(p<=30)
		System.out.println("failed");

	}
	System.out.println("Done");
}

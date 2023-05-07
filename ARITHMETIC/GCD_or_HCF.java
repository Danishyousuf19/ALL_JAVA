import java.util.Scanner;
//CODE TO FIND HIGHEST COMMON FACTOR OF TWO NUMBER
public class GCD_or_HCF {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=sc.nextInt();
		System.out.println("Enter the second number:");
		int y=sc.nextInt();
		System.out.print("GCD of "+x+" and "+y+" is ");
		while(x%y!=0)
		{
			int c=x%y;
			x=y;
			y=c;
		}
		System.out.println(y);
	}
}

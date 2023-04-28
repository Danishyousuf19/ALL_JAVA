import java.util.Scanner;

// name of the program:Write a java program to enter two numbers through the keyboard. Write a program to find the
//value of one number raised to the power of another. (Do not use Java built-in method)
public class POWER_OF_NUMBER {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b=sc.nextInt();
		System.out.println("Enter the power: ");
		int p=sc.nextInt();
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result=result*b;
		}
		System.out.println(b+" to the power "+p+" is: "+result);
	}
}

import java.util.Scanner;
/* 

name of the program:Write a java program to take an integer input from the user and print the input by removing all
zero*/
public class remove_0_from_number {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number:");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,f=0;
		while(temp!=0)
		{
			int b=temp%10;
			if(b!=0)
			{
				rev=rev*10+b;
			}
			temp/=10;
		}
		while(rev!=0)
		{
			int b=rev%10;
			f=f*10+b;
			rev/=10;
		}
		System.out.println("After removing 0 from number "+n+", the new number is "+f);
	}
}

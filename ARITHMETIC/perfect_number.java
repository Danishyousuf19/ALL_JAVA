import java.util.Scanner;
//name of the program:Write a Java program to check if a number is perfect number or not.
public class perfect_number {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) 
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
			System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
}

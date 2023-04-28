import java.util.Scanner;

public class random_no_average {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.print("Random numbers generated are: ");
		int sum=0;
		int i=1;
		do
		{
			int n1=(int)(Math.random()*n+1);
			System.out.print(n1+" ");
			sum+=n1;
			i++;										
		}while(i<=n);
		double avg=(double)sum/n;
		System.out.print("\nAverage of "+n+" random numbers are "+avg);
	}
}

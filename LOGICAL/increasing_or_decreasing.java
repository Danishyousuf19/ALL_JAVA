import java.util.Scanner;

public class increasing_or_decreasing {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number: ");
		int a=sc.nextInt();
		System.out.println("Input second number: ");
		int b=sc.nextInt();
		System.out.println("Input third number: ");
		int c=sc.nextInt();
		if(a>b&&b>c)
		{
			System.out.println("Decreasing");
		}
		else if(a<b&&b<c)
		{
			System.out.println("Increasing");
		}
		else
		{
			System.out.println("Neither increasing nor decreasing order");
		}
	}

}

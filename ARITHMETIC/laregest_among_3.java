import java.util.Scanner;

public class laregest_among_3 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number: ");
		int a=sc.nextInt();
		System.out.println("Input second number: ");
		int b=sc.nextInt();
		System.out.println("Input third number: ");
		int c=sc.nextInt();
		int max=Math.max(a,Math.max(b,c));
		System.out.println("Largest number:"+max);
		if((a>b||a>c)&&a<max)
		{
				System.out.println("2nd largest number:"+a);
		}
		if((b>a||b>c)&&b<max)
		{
				System.out.println("2nd largest number:"+b);
		}
		else {
				System.out.println("2nd largest number:"+c);
		}
	}
}

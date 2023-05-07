import java.util.Scanner;

//Write a java program to generate and print the first n terms of the Fibonacci sequence where
//n>=1.
//The first few terms are:
//0, 1, 1, 2, 3, 5, 8, 13, ......
public class fibonacchi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int w=sc.nextInt();
		int sum=0;int a=0,b=1;System.out.print(a+" "+b+" ");
		for(int i=1;i<=w-2;i++) {
			int c=a+b;System.out.print(c+" ");
			a=b;
			b=c;
			
		}

	}

}

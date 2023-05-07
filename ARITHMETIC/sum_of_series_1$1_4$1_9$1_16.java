import java.util.Scanner;

public class sum_of_series_1$1_4$1_9$1_16 {

	public static void main(String[] args) {
/*		Write a program that will read the value of n from the user and calculate sum of the following 
		series: 1+1/2*2+1/3*3+....
		.*/

		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		double sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+(1.0/(i*i));
		}System.out.println("sum="+sum);
		
	}

}

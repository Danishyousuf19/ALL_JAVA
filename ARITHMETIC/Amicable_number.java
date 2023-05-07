import java.util.Scanner;

//two numbers are amicable if each is equal to the sum of the proper divisors of the other
public class Amicable_number {

	public static void main(String[] args) {
		
	
			Scanner sc=new Scanner(System.in);
	int a=sc.nextInt(),b=sc.nextInt();
			int sum=0,sumb=0;
		for(int i=1;i<a;i++)	{
			if(a%i==0) {
				 sum+=i;
		}
		}
		for (int j=1;j<b;j++) {
			if (b%j==0) {
				sumb+=j;
						}
		}
		if (sum==b&sumb==a)	{
			System.out.println(" is amicable numbers : true");
		}
		else {
			System.out.println(" is amicable numbers : false");
		}
	}
}

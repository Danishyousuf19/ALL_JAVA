import java.util.Scanner;

public class power_O_log_n {
	public static int power(int x ,int n) {
		if(n==0)return 1;
		if(x==0)return 0;
		if(n%2==0) {
			return power(x,n/2)*power(x,n/2);
		}
		
			return power(x,n/2)*power(x,n/2)*x;
		
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			   System.out.println("enter a number");
			   int x=sc.nextInt();
			   System.out.println("enter power term");
			   int n=sc.nextInt();
			  int pow= power(x,n);
			  System.out.println("power = "+pow);

		}
}

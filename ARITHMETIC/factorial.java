import java.util.Scanner;
//WAP to calculate and display the factorial of all numbers between m and n (where m < n, m 
//> 0, n > 0)

public class factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers b/w which you want to find factorial");
		int a=sc.nextInt(),b=sc.nextInt();
		int j=0;
		for (int i=a;i<=b;i++) {int fact=1;
			for (j=i;j>=1;j-- ) {
				fact*=j;
			}
			System.out.printf("factorial of %d is %d\n",i,fact);
		}

	}

}

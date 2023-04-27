import java.util.Scanner;

public class factorial {

	public static int factorial(int num) {
		if(num==1||num==0) {
			return 1;
		}
		int num_n_1=factorial(num-1);
		int factorial=num*num_n_1;
		return factorial;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter a number");
		   int n=sc.nextInt();
	int sol=factorial(n) ;
	System.out.println("factorial of "+n+" = "+sol);

	}

}

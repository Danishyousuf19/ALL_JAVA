import java.util.Scanner;

public class fibonacchi {

	public static void fibonacchi(int n_1,int n_2,int n) {
		
		if(n==0) {
			return;
		}
		int c=n_1+n_2;
		System.out.print(" "+c);
		fibonacchi(n_2,c,n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		   System.out.println("enter  number of elements");
		    int n=sc.nextInt();
		    System.out.print(0+" "+1);
		   fibonacchi(0,1,n-2);
		  
		  
	}

}

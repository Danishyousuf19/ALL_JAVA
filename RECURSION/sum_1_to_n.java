import java.util.Scanner;

public class sum_1_to_n {

	public static void printsum(int begin,int end,int sum) {
		int temp=begin;
		if(begin==end+1) {
			System.out.println("sum of  numbers = "+sum);
			return ;}
		sum+=begin;
		System.out.println(begin);
		//upper line is executed before recursion
		printsum(begin+1,end,sum);
	//	below line is executed after returning 
	//	System.err.println(begin);
	}

		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 System.out.println("enter starting number");
			   int strat=sc.nextInt();
			   System.out.println("enter starting number");
			   int end=sc.nextInt();
			   
	   printsum(strat,end,0);
		}
}

import java.util.Scanner;

public class PRINT_N_TO_0 {

public static void printn(int n) {
	if(n==0)return;
	System.out.print(n+" ");
	printn(n-1);
}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
   System.out.println("enter a number");
   int n=sc.nextInt();
   printn(n);
	}

}

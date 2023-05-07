import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number ");
		int  x=sc.nextInt();
		sc.close();
		boolean b=true;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				b=false;
					break;		
			}
		}
		if(b) {
			System.out.println("yes it is a prime number");
			
		}
		else {
			System.out.println("no it is not a prime");
		}

	}

}

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number ");
		int  x=sc.nextInt();
		sc.close();
		if(x%2==0) {
			System.out.println("the number is EVEN");
		}
		else {
			System.out.println("the number is ODD");
		}

	}

}

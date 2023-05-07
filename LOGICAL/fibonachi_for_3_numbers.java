import java.util.Scanner;

public class fibonachi_for_3_numbers {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c=1,n=sc.nextInt();
		System.out.print(a+" "+b+" "+c+" ");
		for(int i=1;i<=n-3;i++) {
			int d=a+b+c;System.out.print(d+" ");
			a=b;
			b=c;
			c=d;
		}
	}

}

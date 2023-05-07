import java.util.Scanner;
//Write a java program to evaluate the function sin(x) as defined by the infinite series expansion
public class function_sin_X_ {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a angle(x) int radian");
		double limit=.000001;
		double x=sc.nextDouble();
		double term=x;
		int i=1;
		double tsinsum=x;
		while(Math.abs(term)>limit)
		{i+=2;
		 term=-term*((x*x)/(i*(i-1)));
			tsinsum+=term;
		}System.out.println("sin(x) = "+tsinsum);

	}

}

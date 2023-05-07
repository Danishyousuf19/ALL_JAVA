import java.util.Scanner;

public class function_cos_X_ {

	public static void main(String[] args) {
		//Write a java program to evaluate the function sin(x) as defined by the infinite series expansion
		
		
		Scanner sc=new Scanner(System.in);

		double limit=0.000001;
		System.out.println("enter a angle(x) int radian");
		double x=sc.nextDouble();
		double term=1;
		double tcossum=1;
		int i=0;
		while(Math.abs(term)>limit) {
			i+=2;
			term=-term*((x*x)/(i*(i-1)));
			tcossum+=term;
		}System.out.println("cos(x) ="+tcossum);
	}

}

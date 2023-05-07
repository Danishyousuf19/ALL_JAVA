import java.util.Scanner;
//WAP to enter the value of n and display find the following sum of the series:
//1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
public class sum_of_1_12_123_ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int sum=0,a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
			}		}
			
System.out.println(sum);

	}

}

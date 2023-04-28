import java.util.Scanner;
/* 
 name of the program:Write a java program to print largest power of three less than or equal to N.
*/
public class largest_power_of_3_lessthan_n {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int p=-1;
		for( int i=1;i<=n;i=i*3)
		{
			p++;
		}
		System.out.println((int)Math.pow(3, p));
		
	}

}

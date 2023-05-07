import java.util.Scanner;
/*

name of the program:Write a java program to print the multiplication table of a number entered by the user.
*/
public class simple_multiplication_table {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table:");
		int n=sc.nextInt();
		System.out.println("The multiplication table of "+n+" is:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" X " +i+" = "+(n*i));
		}
	}
}

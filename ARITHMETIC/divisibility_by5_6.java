import java.util.Scanner;
/* name of the program:Write a java program that prompts the user to enter an integer and determines whether
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
by 5 or 6, but not both.
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True*/
public class divisibility_by5_6 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number: ");
		int a=sc.nextInt();
		if(a%5==0&&a%6==0)
			System.out.println("Is 10 divisible by 5 and 6? true");
		else
			System.out.println("Is 10 divisible by 5 and 6? false");
		if(a%5==0||a%6==0)
				System.out.println("Is 10 divisible by 5 or 6? true");
		else
			System.out.println("Is 10 divisible by 5 or 6? false");

		if(a%5==0||a%6==0&&a%30!=0)
			System.out.println("Is 10 divisible by 5 or 6, but not both? true");
		else
			System.out.println("Is 10 divisible by 5 or 6, but not both? false");
		}
}

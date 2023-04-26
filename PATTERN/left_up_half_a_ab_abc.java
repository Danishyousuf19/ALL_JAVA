import java.util.Scanner;

public class left_up_half_a_ab_abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter starting and ending character ");
		char b=sc.next().charAt(0);
		char a=sc.next().charAt(0);
		for(char i=b;i<=a;i++)	{
			for(char j=b;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

}
//	    A
//		A B
//		A B C
//		A B C D
//		A B C D E
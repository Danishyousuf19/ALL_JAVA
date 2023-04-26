import java.util.Scanner;

public class left_up_half_1_12_123_1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter height ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
//enter height 
//4
//1 
//1 2 
//1 2 3 
//1 2 3 4 
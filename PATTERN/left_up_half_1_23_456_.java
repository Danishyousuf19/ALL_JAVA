import java.util.Scanner;

public class left_up_half_1_23_456_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter height ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(sum+" ");sum++;
			}System.out.println();
		}
	}

}
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
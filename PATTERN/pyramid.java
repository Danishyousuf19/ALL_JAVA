import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter height ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=(a-i);j++) {
				System.out.print(" ");	}
		for(int k=1;k<=i;k++) {
				System.out.print("*");}
		
		for(int j=1;j<=(i-1);j++) {
			System.out.print("*");
		}System.out.println();
		}
	}

}
//enter height 
//6
//     *
//    ***
//   *****
//  *******
// *********
//***********
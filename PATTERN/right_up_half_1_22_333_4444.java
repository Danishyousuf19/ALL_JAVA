import java.util.Scanner;

public class right_up_half_1_22_333_4444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter height ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		   for(int i=1;i<=a;i++) {
		    	for(int j=i;j<=a-1;j++) {
		    		System.out.print(" ");
		    	}for(int k=1;k<=i;k++) {
		    		System.out.print(i);
		    	}System.out.println();
		    }
	}

}
//enter height 
//5
//    1
//   22
//  333
// 4444
//55555
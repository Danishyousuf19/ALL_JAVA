import java.util.Scanner;

public class left_down_high_$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter height ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		 for(int i=1;i<=a;i++) {
		    	for(int j=i;j<=a;j++) {
		    		System.out.print("$");
		    	}System.out.println();
		    }
	}

}
//enter height 
//5
//$$$$$
//$$$$
//$$$
//$$
//$
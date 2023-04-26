import java.util.Scanner;

public class digonal_cut_rectangle {

	public static void main(String[] args) {
		System.out.println("enter height ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
		for(int j=a;j>=1;j--) {
			if(j==i) {System.out.print("*");}
			else {System.out.print(j);}
		}System.out.println();
	}

	}

}

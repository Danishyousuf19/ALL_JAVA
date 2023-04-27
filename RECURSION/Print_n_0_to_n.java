import java.util.Scanner;

public class Print_n_0_to_n {

	public static void printn(int begin,int end) {
		
		if(begin==end+1)return;
		System.out.print(begin+" ");
		
		printn(begin+1,end);
	}

		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	   System.out.println("enter Starting   number");
	   int start=sc.nextInt();
	   System.out.println("enter ending number");
	   int end=sc.nextInt();
	   
	   printn(start,end);
		}
}

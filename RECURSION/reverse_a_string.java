import java.util.Scanner;

public class reverse_a_string {

	static void print_string(String str,int index) {
		
		if(index==0) {
			System.out.print(str.charAt(index));return;
		}
		System.out.print(str.charAt(index));
		print_string(str,index-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   String str=sc.next();
		   int idx=str.length()-1;
		   print_string(str,idx);

	}

}

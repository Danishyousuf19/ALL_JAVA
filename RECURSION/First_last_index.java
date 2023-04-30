import java.util.Scanner;

public class First_last_index {
	public static int first=-1;
	public static int last=-1;
	public static void find_index(String s,int idx,char element) {
		if(idx==s.length()) {
			System.out.println("first occurance ="+first);
			System.out.println("last occurance ="+last);
			return;
		}
		char current =s.charAt(idx);
		
		if(current==element) {
			if(first==-1) {
				first=idx;
			}else{
				last=idx;
			}
		}
		find_index(s,idx+1,element);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   String str=sc.next();
		   System.out.println("enter character");
		   char c=sc.next().charAt(0);
				find_index(str,0,c) ;  

	}

}

import java.util.Scanner;

public class new_Sub_sequence {

	static void sub(String s,int idx,String nue) {
		
		if(idx==s.length())
		{
			System.out.println(nue);
			return;
		}
		char current=s.charAt(idx);
		//to be
		sub(s,idx+1,nue+current);
		//not to be
		sub(s,idx+1,nue);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   String x=sc.next();
		   sub(x,0,"");
	}

}

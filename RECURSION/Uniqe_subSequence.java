import java.util.HashSet;
import java.util.Scanner;

public class Uniqe_subSequence {
static void sub(String s,int idx,String nue,HashSet<String> set) {
		
		if(idx==s.length())
		{
			if (set.contains(nue)) {
				return;
			}else {
			System.out.println(nue);
			set.add(nue);
			return;
		}}
		char current=s.charAt(idx);
		//to be
		sub(s,idx+1,nue+current,set);
		//not to be
		sub(s,idx+1,nue,set);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   HashSet<String> set=new HashSet<>();
		   
		   String x=sc.next();
		   sub(x,0,"",set);}

}

import java.util.Scanner;

public class remove_duplicate {
//store alphab.index 
	public static boolean map[]=new boolean[26];
	
	public static void remove(String olds,int idx,String news) {
		if(idx==olds.length()) {
			System.out.println("new String = "+news);
			return;
		}
		
		char current =olds.charAt(idx);
		if(map[current-'a']) {
			remove(olds,idx+1,news);
		}
		else {
			news+=current;
			map[current-'a']=true;
			remove(olds,idx+1,news);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   String x=sc.next();
		   remove(x,0,"");

	}

}

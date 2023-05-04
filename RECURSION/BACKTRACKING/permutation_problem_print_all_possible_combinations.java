import java.util.Scanner;

public class permutation_problem_print_all_possible_combinations {

	static void print (String s,String perm,int idx) {
		if(s.length()==0) {
			System.out.println(perm);
			return;
		}
		for (int i=0;i<s.length();i++) {
			char current=s.charAt(i);
			String nue=s.substring(0,i)+s.substring(i+1);
			print(nue,perm+current,idx+1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entre string");
		String d=sc.next();
		print(d,"",0);

	}

}

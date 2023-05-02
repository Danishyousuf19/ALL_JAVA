import java.util.Scanner;

public class Print_Permutations {

	static void Permutations(String s,String permu) {
		if(s.length()==0) {
			System.out.println(permu);
			return;
		}
		for (int i=0;i<s.length();i++) {
			char current=s.charAt(i);
		String news =s.substring(0,i)+s.substring(i+1);
	//	"abc"-->a-->"bc"
		Permutations(news,permu+current);
		
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   String str=sc.next();
		   Permutations(str,"");

	}

}

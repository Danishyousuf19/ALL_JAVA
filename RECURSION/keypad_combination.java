import java.util.Scanner;

public class keypad_combination {

	static String keypad[]= {
			".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
	};
	
	static void combination(String s,int idx,String comb) {
		if(idx==s.length()) {
			System.out.println(comb);return;
			
		}
		char current=s.charAt(idx);
		String mapping =keypad[current-'0'];
		for(int  i=0;i<mapping.length();i++) {
			combination(s,idx+1,comb+mapping.charAt(i));
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter String");
		   String x=sc.next();
		   combination(x,0,"");
		   
	}

}

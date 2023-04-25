import java.util.Scanner;
class Eror extends Exception{
	public String getMessage() {
		System.err.println("*ERROR* enter BINARY NUMBER ( only in terms of 0 and 1)");
		return"";
				
	}
}


public class Binary_to_decimal$INTEGER$ {

	static void to_decimal(int n) throws Eror {
		String g=Integer.toString(n);
		int  k=0;
		int pow=0;
		int x=g.length();
		for(int i=x-1;i>=0;i--) {
			
			int v=g.charAt(i)-48;
			if(v>=2) {
				throw new Eror();
			}
			
			k+=(v*(int)Math.pow(2, pow));
			pow++;
		}
		System.out.println("dicimal number = "+k);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for dicimal conversion /n enter only interms of 0 and 1");	
		  int n1=sc.nextInt();
		  try {
          to_decimal(n1);}
		  catch (Eror e) {
			  System.out.println(e.getMessage());
		  }

	}

}

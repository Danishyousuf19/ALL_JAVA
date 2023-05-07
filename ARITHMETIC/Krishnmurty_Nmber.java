import java.util.Scanner;

//Krishnamurthy number can be defined as a number when the sum
//of the factorial of all digits is equal to the original number. This Krishnamurthy
//number is also called the Strong number, Special number and Peterson number.

class eror extends Exception{
	public String getMessage() {
		return "*ERROR*";
		
	}
			
}

public class Krishnmurty_Nmber {
  static boolean check(int n)throws eror {
	  if(n<0){
		  throw new eror();
	  }
	  if(n==0) {
		  return true;
	  }
	  int orig=n;
	  int sum=0;
	  for(;n>0;n/=10)
	  {
			int x=n%10;
			int fact=1;
			while(x>0) {
				fact*=x;
				x--;}
			sum+=fact;
		  }
	  if(sum==orig) {
			 return true;  
		  }
		return false;
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number ");
		int  x=sc.nextInt();
		sc.close();
		try {
		if(check(x)) {
			System.out.println("is a krishnamurty number :TRUE");
		}
		else {
			System.out.println("is a krishnamurty number :FALSE");
		}
		}
		catch(eror e) {
		 System.err.println(e.getMessage());
		}
	}

}

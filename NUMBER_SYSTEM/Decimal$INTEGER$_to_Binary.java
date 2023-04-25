import java.util.Scanner;

public class Decimal$INTEGER$_to_Binary {
  static void to_binary(int n) {
	String b="";
	while(n!=0) {
		b=n%2+b;
		n/=2;
	}
	while(b.length()<30) {
		b="0"+b;
	}
	System.out.println("Binary form of integer "+n+" = "+b);
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for binary conversion");
		  int n1=sc.nextInt();
          to_binary(n1);
	}

}

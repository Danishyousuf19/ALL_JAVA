import java.util.Scanner;

//Write a recursive method in Java which, given an integer n, print it with its digits reversed.
//For example, given 4735, it prints 5374
//Sample run:
//Enter the number that you want to reverse: 
//3456
//The reverse of the given number is: 6543

public class recursionQ_8 {
public static void reverse(int a,int rev) {
	if(a==0) {
		System.out.println("Reverse   : "+rev);
		return;
	}
	;
	reverse(a/10,rev=rev*10+a%10);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
System.out.println("enter a number");
int n=Sc.nextInt();
reverse(n,0);
	}

}

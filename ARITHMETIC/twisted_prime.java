import java.util.Scanner;
//A number is called a twisted prime number if it is a prime
//number and reverse of this number is also a prime number
public class twisted_prime {
	
	public static void main(String[] args) 
	{
	int count=0,countr =0;
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();int rev=0;
	for (int j=2;j<a;j++)
	{
		if(a%j==0) {
			count++;
		}
	}if (count >0) {
		System.out.println("number is not a prime");
	}
	else if(count==0) {for (int i=a;i>0;i/=10 )
	{
		rev=rev*10+i%10; 
	}
	for (int j=2;j<rev;j++)
	{
		if(rev%j==0) {
			countr++;
		}
		
	}if (countr >0) {
		System.out.println("number rev not prime");
	}else if(count==0) {
		System.out.println("yes number are twisted prime");}}
}
}
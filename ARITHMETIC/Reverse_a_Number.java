import java.util.Scanner;

public class Reverse_a_Number {
static int reverse(int a) {
	int rev=0;
	if(a<0) {
		a*=-1;
		for(;a>0;a/=10){
			rev=rev*10+a%10;

		}
		return -1*rev;
	}
	
	for(;a>0;a/=10){
		rev=rev*10+a%10;

	}
	return rev;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number ");
		int  x=sc.nextInt();
		sc.close();
		System.out.println("number after reverse = "+reverse(x));
	}

}

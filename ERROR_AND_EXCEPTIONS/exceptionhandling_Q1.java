import java.util.Scanner;

/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.
*/

public class exceptionhandling_Q1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your lucky number");
	int n=sc.nextInt();
	 try {
		if(n<0){
			throw new NumberFormatException("Negative number");
		}
		System.out.println("Your lucky number is "+n);
		}
	catch(NumberFormatException e) {
		System.out.println(e);
	}
	

	}

}

//Sample run-1:
//Enter your lucky number
//-90
//java.lang.NumberFormatException: Negative number
//Sample run-2:
//Enter your lucky number
//34
//Your lucky number is 34
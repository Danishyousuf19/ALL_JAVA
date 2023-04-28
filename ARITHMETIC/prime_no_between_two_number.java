import java.util.Scanner;
//WAP to enter the first number and second number. Display the prime numbers between the 
//first and second number.

public class prime_no_between_two_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       int a=sc.nextInt(),b=sc.nextInt();
		for (i = a; i <= b; i++)         
	       {   		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from a to b are :");
	       System.out.println(primeNumbers);
	}

}

import java.util.Scanner;

//Create a class Bank with instance variables account_no, name, and balance of the customer.
//If the input balance is less than or equal to zero then create an Exception called “Invalid
//BalanceException” and throw it using Java. Display the custom message “Balance cannot be 
//less than 0”.
class BalanceException extends Exception{
	public  String toString () {
		return "BalanceException :Balance cannot be less than 0.";
	}
}
class bank {
	String name;
	Double bal;
	int acc_no;
	void setdata() {
		System.out.println("Enter name");
		Scanner Sc=new Scanner(System.in);
		name=Sc.nextLine();
		System.out.println("Enter Account number");
		acc_no=Sc.nextInt();
		System.out.println("Enter balance");
		bal=Sc.nextDouble();
	}
	void getdata()throws BalanceException{
		System.out.println("Details of the Account Holder");
		System.out.println("Name :"+name);
		System.out.println("Account number: "+acc_no);
		System.out.println("Balance: "+bal);
		System.out.println("Enter the money to withdraw");
		Scanner Sc=new Scanner(System.in);
		double debit=Sc.nextDouble();
		double last=bal-debit;
		if(last<0) {
			throw new BalanceException();
		}
		System.out.println("After withdraw, Balance = "+last);
		
	}
}

public class exceptionhandling_HA_1 {

	public static void main(String[] args) {
		bank b=new bank();
		try {
			b.setdata();
			b.getdata();
			
		}
		catch(BalanceException e) {
			System.out.println(e);
		}

	}

}
//Sample run-1:
//Enter name
//Rahul
//Enter Account number
//1235
//Enter balance
//700
//Details of the Account Holder
//Name: Rahul
//Account number: 123
//balance: 700.0
//Enter the money to withdraw
//300
//After withdraw, Balance = 400.0
//Sample run-2:
//Enter name
//Rahul
//Enter Account number
//1235
//Enter balance
//700
//Details of the Account Holder
//Name: Rahul
//Account number: 1235
//Balance: 700.0
//Enter the money to withdraw
//900
//InvalidBalanceException: Balance cannot be less than 0
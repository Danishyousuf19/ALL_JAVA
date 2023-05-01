import java.util.Scanner;
// Some websites impose certain rules for passwords. 
// Write a method that checks whether a string is a valid password. Suppose the password rules 
// are as follows:
//  A password must have at least eight characters.
//  A password consists of only letters and digits.
//  A password must contain at least two digits. 
// Write a program that prompts the user to enter a password and displays Valid Password if the 
// rules are followed or Invalid Password otherwise
public class Q9 {
//password
	public static boolean isValidPassword(String password) {
	    // Check the length of the password
	    if (password.length() < 8) {
	        return false;
	    }
	    
	    // Check that the password contains only letters and digits
	    if (!password.matches("[a-zA-Z0-9]+")) {
	        return false;
	    }
	    
	    // Check that the password contains at least two digits
	    int count = 0;
	    for (int i = 0; i < password.length(); i++) {
	        if (Character.isDigit(password.charAt(i))) {
	            count++;
	        }
	        if (count >= 2) {
	            return true;
	        }
	    }
	    
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter passcode");
String a=sc.next();

if (isValidPassword(a)) {
	System.out.println("valid");
}else  {
	System.out.println("not valid ");

	}}}
	


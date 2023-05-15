import java.util.Scanner;

//Question-3:
//Write a recursive Java method that determines if a string s is a palindrome, that is, it is
//equal to its reverse. 
//Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'.
public class recursion_HA_3 {
public static boolean  palendrom(String a,String b,int i) {
	if(i<0) {
	if(a.equals(b)) {
		return true;
	}return false;}
	char c=a.charAt(i);
return palendrom(a,b+c,i-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter String ");
		String a=sc.nextLine();
		int i=a.length();
System.out.println("Is palendrom : "+palendrom(a,"",i-1));
	}

}
//Enter String 
//gohangasalamiimalasagnahog
//Is palendrom : true
//Enter String 
//racecar
//Is palendrom : true

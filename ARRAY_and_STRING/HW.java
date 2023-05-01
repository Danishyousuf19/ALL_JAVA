import java.util.Arrays;
// Question-1:
// Write a program to find the first non-repeated character in a given String, for example, if the 
// given String is "Java" then the first non-repeated character is "J".
// Question -2:
// Write a java program to calculate the volume of sphere, cuboid and cube by using method 
// overloading.
// Volume of a cube = s * s * s [s: Side of the cube]
// Volume of a Sphere = 4
// 3
// × π × r
// 3
// [r: radius]
// Volume of a cuboid = L × b × h [L: Length, b: Breadth, h: Height]
// Question-3:
// Write a Java method to display the middle character of a string.
// Note:
// a) If the length of the string is odd there will be one middle characters.
// b) If the length of the string is even, then there would be two middle characters, we need 
// to print the second middle character.
// Example: 
// Input a string: ABC
// Expected Output:
// The middle character in the string: B
// Example: 
// Input a string: JAVA
// Expected Output:
// The middle character in the string: V
// Question-4:
// Write a Java method to count all words in a string.
// Example: 
// Input the string: 
// The quick brown fox jumps over the lazy dog.
// Expected Output:
// Number of words in the string: 9
// Question-5:
// Write a Java method that accept three integers and check whether they are consecutive are not. 
// Return true or false.
// Expected Output:
// Input the first number: 15
// Input the second number: 16
// Input the third number: 17
// Check whether the three said numbers are consecutive or not!
// true
// ************
public class HW {
	
	
	
// Q3middle char
	public static char middle(String a) {
		 int c=(a.length()/2);
		char ch=a.charAt(c);
		return ch;
	}
	
	
	// Q1nonrepeted;
	

	public static char findFirstNonRepeatedChar(String s) {
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (s.indexOf(c) == s.lastIndexOf(c)) {
	            return c;
	        }
	    }
	    // return null if there are no non-repeated characters
	    return '\0';
	}

	// Q4 
	public static void words(String a) {
		int count =0;
		String arr[]=a.split(" ");
	System.out.println(Arrays.toString(arr));//to display string array
		System.out.println(arr.length);
	}
	
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
System.out.println("middle char = "+middle("ava"));

	System.out.println("are numbers consecative : "+checknum(3,1,2));
	
	System.out.println("the first non repeated char is : "+findFirstNonRepeatedChar("javsgvja"));

	String is="danish yousuf bhat ";
 
	words(is);
	
	System.out.println("WEWww"+repeted("dannhkdah"));
	String s="gdaijjgissmdak";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		int c=0;
		for(int j=0;j<s.length();j++)
		{
			char ch1=s.charAt(j);
			if(ch1==ch) {
				c++;
			}
			
		}
		if(c==1) {
			System.out.println(ch+"xxx");
			break;}
	}
// Q5Consecutive    
		}
	public static boolean checknum(int a, int b,int c)
	{
		int num[]= {a,b,c};
		 Arrays.sort(num);
		 return num[1]==num[0]+1&&num[2]==num[1]+1;
	}
 static char repeted(String a) {
	int no=0;
	for(int i=0;i<a.length();i++) {int co=0;
	char c=a.charAt(i);
		for(int j=0;j<a.length();j++) {
		if(a.charAt(i)==a.charAt(j)) {
			co++;
		}
	}if(co==1) {
			return c;
		}
	}	
	return '\0';
}
 public static int c(String str) {
	    if (str == null || str.isEmpty()) {
	        return 0;
	    }
	    
	    int wordCount = 0;
	    boolean presentinWord = false;
	    
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if (Character.isWhitespace(c)) {
	            presentinWord = false;
	        } else if (!presentinWord) {
	            presentinWord = true;
	            wordCount++;
	        }
	    }
	    
	    return wordCount;
	}
	
}

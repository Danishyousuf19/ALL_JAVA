import java.util.Arrays;

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

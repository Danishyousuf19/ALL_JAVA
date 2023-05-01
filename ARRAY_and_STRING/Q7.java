// Write java method called count accepts a string as input and returns the number of vowels in 
// it. The method header is given below.
// public static int count(String str)
// For example, count ("Welcome") returns 2.
public class Q7 {
	public static int count(String str) {
		int number=0;
		for(int i=0;i<str.length();i++) {
			if (       str.charAt(i) == 'a'
					|| str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u'
	                || str.charAt(i) == 'A'
	                || str.charAt(i) == 'E'
	                || str.charAt(i) == 'I'
	                || str.charAt(i) == 'O'
	                || str.charAt(i) == 'U') {
				number++;
			}
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="Danish Yousuf Bhat";
System.out.println("number of  vovels = "+count("danish"));
	}

}

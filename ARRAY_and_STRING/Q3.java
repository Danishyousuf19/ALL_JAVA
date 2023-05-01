
public class Q3 {
	
public static int ispalendrom(int a) {
	int rev=0;
	for(;a>0;a/=10) {
		rev=rev*10+a%10;
	}
	return rev;
}
// According to question 
public static int reverse(int a) {
	int rev=0;
	for(;a>0;a/=10) {
		rev=rev*10+a%10;
	}
	return rev;
}
public static boolean palendrom(int a) {
	if (a==reverse(a)){
		return true;
	}
   return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//return
		int c=42744724;
		int d=ispalendrom(c);
		if(c==d) {
			System.out.println("yes palendrom");
		}
		else {
			System.out.println("no it is not");
		}
//void
		checkpalendrom(c);
//according to question
	int f=reverse(c);
	boolean check=palendrom(c);
		System.out.println("is palendrom:"+check);
	}
	
	
public static void checkpalendrom(int a) {
	int rev=0;int ao=a;//store a in another variable
	for(;a>0;a/=10) {
		rev=rev*10+a%10;
	}
	if(ao==rev) {
		System.out.println("yes palendrom");
	}
	else {
		System.out.println("no it is not a palendrom");
	}
	
}
}

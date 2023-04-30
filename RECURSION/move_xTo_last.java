import java.util.Scanner;

public class move_xTo_last {
static void move_X(String old,int idx,int count,String New) {
	if(idx==old.length()) {
		for(int i=0;i<count;i++) {
		New+='x';
		}
		System.out.println("new strig : "+New);return;
	}
	char current=old.charAt(idx);
	if(current=='x') {
		count++;
		move_X(old,idx+1,count,New);
	}
	else {
		New+=current;
		move_X(old,idx+1,count,New);
	}
			
	
}
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
	   System.out.println("enter String");
	   String x=sc.next();
	   move_X(x,0,0,"");

	}

}

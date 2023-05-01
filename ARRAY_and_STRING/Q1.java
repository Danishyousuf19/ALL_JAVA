
public class Q1 {
	
public static int addition (int a,int b) {
	return a+b;
}
public static  int subtraction (int a,int b) {
	return a-b;
}
public static int multiplication (int a,int b) {
	return a*b;
}
public static  int remainder (int a,int b) {
	return a%b;
}
public static double divide (double a,double b) {
	return a/b;
}
public static  double squareroot (double a) {
	double c=Math.sqrt(a);
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3,b=8;
		int c=addition (a,b);
		System.out.printf("addition of %d and %d = %d\n",a,b,c);
		
		int d=subtraction(a,b);
		System.out.printf("subtraction of %d and %d = %d\n",a,b,d);
		
		int e=multiplication (a,b);
		System.out.printf("muliplication of %d and %d = %d\n",a,b,e);
		
		int f=remainder(a,b);
		System.out.printf("remainder of %d / %d = %d\n",a,b,f);
		
		double g=divide (a,b);
		System.out.println("division of "+a+" and "+b+" = "+g);
		
		double h=squareroot(a);
		System.out.println("squareroot of "+a+" = "+h);
		System.out.printf("squareroot of %d =%6.3f",a,h);
	}

}

// Design a Simple Calculator using methods in java containing the following functionalities, 
// namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The 
// signature of the methods are given below.
//  public static int additionSimple(int x, int y)
//  Two inputs, x and y. Return the result of adding x to y.
//  public static int subtractionSimple(int x, int y)
//  Two inputs, x and y. Return the result of subtracting x from y i.e y-x.
//  public static int multiplicationSimple(int x, int y)
//  Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.
//  public static double divisionSimple(int x, int y)
//  Two inputs, x and y. Return the result of dividing y by x. Please check whether 
// x is zero before dividing.
//  public static int remainderSimple(int n, int m)
//  Please make sure that remainderSimple() takes two inputs, namely, a number
// (int) n and a number (int) m. The method should return the remainder of n 
// divided by m.
//  public static double squareRootSimple(int n)
//  Takes one input, namely a number n, and returns the square root of the number. 
// The return should be double. Please kindly make sure that the number n is 
// positive
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

// Write a java program to calculate the area of triangle, square, circle, rectangle by using method 
// overloading.

public class Q10 {
//overloading
	public static int area(int a,int b) {
		return a*b;
	}
	public static int area(int a) {
		return a*a;
	}
	public static double area(double a) {
		return 3.14*a*a;
	}
	public static double area(int a,double b) {
		return .5*a*b;
	
	}
	public static int volume(int a) {
		return a*a*a;
	}
	public static int volume(int a,int b,int c) {
		return a*b*c;
	}
	public static double volume(double a) {
		return 3.14*1.333*a*a*a;
	}
	
	public static void main(String[] args) {int b=Integer.MAX_VALUE;
		System.out.println("area of square = "+area(2));
		System.out.println("area of rectangle = "+area(2,3));
		System.out.println("area of circle = "+area(2.0));
		System.out.println("area of triangle = "+area(2,3.0));
		System.out.println(b*5);
	}

}

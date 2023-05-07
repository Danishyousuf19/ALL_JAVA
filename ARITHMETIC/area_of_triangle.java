import java.util.Scanner;
//:Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
//a triangle and displays its area. The formula for computing the area of a triangle is
public class area_of_triangle {
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three points for a triangle: ");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		double a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		double c=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
		double b=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
		double s=(a+b+c)/2;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is "+area);
}
}
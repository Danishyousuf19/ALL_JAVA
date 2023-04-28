import java.util.Scanner;

public class marks_grade_switchcase {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		double m=sc.nextDouble();
		int m1=(int)(m/10);
		switch(m1)
		{
		case 10:
		case 9:
			System.out.println("O");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		case 4:
			System.out.println("E");
			break;
		default:
			System.out.println("F");
			break;
	}
}
}

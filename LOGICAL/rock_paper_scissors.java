import java.util.Scanner;

public class rock_paper_scissors {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 for scissor,1 for rock,2 for paper");
		int b=sc.nextInt();
		int a=(int)(Math.random()*3);
		if(a==b)
		{
			if(a==0)
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			else if(a==1)
				System.out.println("The computer is rock. You are rock too. It is a draw");
			else
				System.out.println("The computer is paper. You are paper too. It is a draw");
		}
		else {
			if(a==0&&b==1)
				System.out.println("The computer is scissor. You are rock. You won");
			else if(a==1&&b==2)
				System.out.println("The computer is rock. You are paper. You won");
			else if(a==2&&b==0)
				System.out.println("The computer is paper. You are scissor. You won");
			else if(a==1&&b==0)
				System.out.println("The computer is rock. You are scissor. You loss");
			else if(a==2&&b==1)
				System.out.println("The computer is paper. You are rock. You loss");
			else if(a==0&&b==2)
				System.out.println("The computer is scissor. You are paper. You loss");
		}
	}
}

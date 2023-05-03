import java.util.Scanner;

public class call_guests_either_in_pair_or_single {
//calculate no of ways by which u can call guests either pair wise or single
	static int ways(int n) {
		if(n<=1)
			return 1;
		int single=ways(n-1);
		int pair =ways(n-2)*(n-1);
		return single+pair;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter numbre of guests");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
System.out.println("number of ways = "+ways(x));

	}

}

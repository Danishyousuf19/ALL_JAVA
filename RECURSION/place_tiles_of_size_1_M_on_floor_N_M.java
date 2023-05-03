import java.util.Scanner;

public class place_tiles_of_size_1_M_on_floor_N_M {

	//find no of ways to place tiles of size 1*m on floor of size n*m
	static int ways(int n,int m) {
		if(n==m)return 2;
		if(n<m)return 1;
		//vertical
		int verticalways=ways(n-m,m);
		//horizontal
		int horizontalways=ways(n-1,m);
		return horizontalways+verticalways;
		
	}
	public static void main(String[] args) {
		System.out.println("enter size of floor");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		System.out.println("number of ways = "+ways(n,m));

	}

}

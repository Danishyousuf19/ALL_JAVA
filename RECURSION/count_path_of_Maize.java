import java.util.Scanner;

//
//RULES
//1 : ONLY MOVE EITHER RIGHT OR DOWNWARDES
//2 : CAN NOT MOVE DIGONALLY OR LEFT OR UPWARDS
//
public class count_path_of_Maize {
	
	static int count(int i,int j,int n,int m) {
		
		if(i==n||j==m) {
			return 0;
		}
		if(i==n-1&&j==m-1) {
			return 1;
		}
int downpath=count(i+1,j,n,m);
		int rightpath=count(i,j+1,n,m);
		return downpath+rightpath;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter starting point cordinates of maize ie (i,j)");
		 int i=sc.nextInt(),j=sc.nextInt();
	
		   System.out.println("enter  poiendnt cordinates of maize ie (n,m)");
		   int n=sc.nextInt();int m=sc.nextInt();
	
		  int tot= count(i,j,n,m);
		  System.out.println("total legal paths = "+tot);
		   

	}

}

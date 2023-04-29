import java.util.Scanner;

public class Tower_of_hanoi {

public static void tower_of_henoi(int n,String Source,String Helper,String Destination) {
	if(n==1) {
		System.out.println("transfer disk "+n+" from "+Source+" to "+Destination);
		return;
	}
	tower_of_henoi(n-1,Source,Destination,Helper );//transfer of n-1 from source to helper
	System.out.println("transfer disk "+n+" from "+Source+" to "+Destination);
	tower_of_henoi(n-1,Helper,Source,Destination );//transfer of n-1 from helper to  destination
}
	
	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
	   System.out.println("enter number of disks");
	   int n=sc.nextInt();
	   tower_of_henoi(n, "source","helper","destination");

	}

}

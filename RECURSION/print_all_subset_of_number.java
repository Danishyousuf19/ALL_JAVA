import java.util.ArrayList;
import java.util.Scanner;

public class print_all_subset_of_number {

	static void print (ArrayList<Integer>subset) {
		for(int i=0;i<subset.size();i++ ) {
			System.out.print(subset.get(i));
	}System.out.println();
	}
	static void find(int n,ArrayList<Integer>subset) {
		if(n==0) {
			print(subset);
			return;
		}
		//add hoga
		subset.add(n);
		find(n-1,subset);
		subset.remove(subset.size()-1);
		//add nahi hoga
		find(n-1,subset);
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("enter  number/size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>subset=new ArrayList<>();
		find(n,subset);

	}

}

import java.util.Scanner;

class is_sotted {
public static boolean  isSotted(int arr[],int idx) {
	if(idx==arr.length-1) {
		return true;
	}
	
	if(arr[idx]<arr[idx+1]) {
		return isSotted(arr,idx+1);
	}else {
		return false;
	}
	
}
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
	   System.out.println("enter a array size ");
	   int x=sc.nextInt() ;
int arr[]=new int [x];
for(int i=0;i<x;i++) {
	System.out.println("enter elements of array");
	arr[i]=sc.nextInt();
}
System.out.println("is Sotted : " +isSotted(arr,0));


	}
	//extra way
	public static boolean  opposite(int arr[],int idx) {
		if(idx==arr.length-1) {
			return true;
		}
		
		if(arr[idx]>=arr[idx+1]) {return false;
			
		}else {
			return isSotted(arr,idx+1);
		}
		
	}
}

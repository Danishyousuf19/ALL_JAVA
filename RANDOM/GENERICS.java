package extra;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

class OPPERATION <T>{
	T element;
	public OPPERATION(T element) {
		this.element=element;
		System.out.println("test "+5);
	}
	public static <T> void display(T[]array) {
		System.out.println("printing...");
		for( T elem:array) {
		System.out.print(elem+" ");
		}
	}
}
public class GENERICS {

	public static void main(String[] args) {
		OPPERATION <Integer> s=new OPPERATION<Integer>(5); 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements of array");
		Integer[] arr=new Integer[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		OPPERATION.display(arr);
 //  ArrayList<String>list=new ArrayList<>();
	}

}

import java.util.Scanner;

//Write a java program to print an array of different type using a single Generic method. The
//signature of printArray method is given below.
//public static < E > void printArray( E[] inputArray)

public class genericsQ_4 {
	public static < E > void printArray( E[] inputArray) {
		for(E object:inputArray) {
			System.out.print(object+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		Integer arri[]=new Integer[5]; 
		for(int a=0;a<5;a++) {
			arri[a]=sc.nextInt();
		}
		System.out.println("Integer Array contains:");
		printArray(arri);
		System.out.println("Enter array elements");
		Double arrd[]=new Double[5]; 
		for(int a=0;a<5;a++) {
			arrd[a]=sc.nextDouble();
		}
		System.out.println("Double  Array contains:");
		printArray(arrd);
	}
}
//
//Sample run:
//Enter array elements
//1
//2
//3
//4
//5
//Integer Array contains:
//1 2 3 4 5 
//Enter array elements
//1.2
//2.3
//3.4
//4.5
//5.6
//Double Array contains:
//1.2 2.3 3.4 4.5 5.6
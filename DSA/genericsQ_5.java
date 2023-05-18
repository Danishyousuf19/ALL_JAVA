import java.util.Scanner;

//Write a java method using Generic to count the occurrence of an element in an array of any
//type. The signature of count method is given below.
//public static <T> int count(T[] array, T item)

public class genericsQ_5 {
	public static <T> int count(T[] array, T item) {
		int i=0;
		
		for (int j=0;j<array.length;j++) {
			if(array[j].equals(item)) {
				i++;
			}
			
		}
		return i;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer arr[]=new Integer[5];
		System.out.println("Enter elements of array");
for(int i=0;i<5;i++) {
	arr[i]=sc.nextInt();
}
		System.out.println("Enter the element to search");
		int x=sc.nextInt();
	System.out.println( "Number of times "+x+" present in the array is "+count(arr, x))	;
	}

}
//Sample run:
//Enter elements of array
//1
//2
//3
//4
//5
//Enter the element to search
//4
//Number of times 4 present in the array is 1
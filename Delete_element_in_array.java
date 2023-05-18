import java.util.Scanner;

public class Delete_element_in_array {
static <T>void delete(T arr[],int i){
	for(int j=i;j<arr.length-1;j++) {
		
		arr[j]=arr[j+1];
	}
	arr[i]=null;
	for(T e:arr) {
		System.out.print(e+" ");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\
		System.out.println("INTEGER OUTPUT");
		System.out.println("enter size of array");
		int s=sc.nextInt();
		System.out.println("enter elements of array");

		Integer arr[]=new Integer [s];
		
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}	
		///sc.nextLine();
		System.out.println( "enter index for deleteing");
		int x=sc.nextInt();
		sc.nextLine();
		delete(arr,x);
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
		System.out.println("STRING OUTPUT");
		String Str[]=new String [s];
		for(int j=0;j<s;j++) {
			Str[j]=sc.nextLine();
		}	
		System.out.println( "enter element and index for inserting");
		
		int m=sc.nextInt();
		delete(Str,m);
//Similarly same for character and double
		Character c[]=new Character[s];
		Double d[]=new Double[s];
		Boolean b[]=new Boolean[s];
//		for(int i=0;i<5;i++) {
//			b[i]=sc.nextBoolean();
//		}
//		delete(b,2);
	}

}

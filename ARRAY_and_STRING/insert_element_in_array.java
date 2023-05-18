package extra;

import java.util.Scanner;

public class insert_element_in_array {

	static <T>void insert(T arr[],T x,int y){
		int s=arr.length;
		for(int i=s-2;i>y-1;i--) {
			arr[i+1]=arr[i];
		}
		arr[y]=x;
		System.out.println("array after inserting");
		for(int i=0;i<s;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\
System.out.println("INTEGER OUTPUT");
System.out.println("enter size of array");
int s=sc.nextInt();
System.out.println("enter elements of array");

Integer arr[]=new Integer [s+1];
for(int i=0;i<s;i++) {
	arr[i]=sc.nextInt();
}	
System.out.println( "enter element and index for inserting");
int x=sc.nextInt();
int i=sc.nextInt();
insert(arr,x,i);
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
System.out.println("STRING OUTPUT");
String Str[]=new String [s+1];
for(int j=0;j<s;j++) {
	Str[j]=sc.nextLine();
}	
System.out.println( "enter element and index for inserting");
String d=sc.nextLine();
int m=sc.nextInt();
insert(Str,d,m);
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class pr {
	public static boolean c(int a,int b,int c) {
		boolean d=false;int e=Math.max(Math.max(a, b), c),f=Math.min(Math.min(a, b), c);int g=a+b+c-e-f;
		int arr[]= {e,g,f};
		
		System.out.println(Arrays.toString(arr));
		if(arr[0]==arr[1]+1&arr[0]==arr[2]+2) {
			d=true;return d;
		}
return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	//System.out.println(c(2,4,3));
	//Scanner sc=new Scanner(System.in);
	//System.out.print("Enter String ");
//	String s="jjjljaa";
//	for(int i=0;i<s.length();i++)
//	{int c=0;
//		char ch=s.charAt(i);
//		
//		for(int j=0;j<s.length();j++)
//		{
//			char ch1=s.charAt(j);
//			if(ch1==ch) {
//				c++;
//			}
//			
//		}
//		if(c==1) {
//			System.out.println(ch);
//			break;}
//	}
//	
//	int arr[]= {2,4,1,3,4,6};
//	for(int i=0;i<arr.length;i+=2) {
//		int r=arr[i];
//		arr[i]=arr[i+1];
//		arr[i+1]=r;
//		
//	
//	}System.out.println(Arrays.toString(arr));
int a=2000;
//String l=(a%100==0?(a%400==0?"yes":"no"):(a%4==0?"yes":"no"));System.out.println(l);

String ab="faa",bc="daa";
System.out.println(ab.compareTo(bc));















	}

}
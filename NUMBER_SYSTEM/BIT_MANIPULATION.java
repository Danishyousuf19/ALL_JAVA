import java.util.Scanner;

public class BIT_MANIPULATION {
	static void GetBit(int n,int pos  ) {
		   int bitmask=1<<pos;
		   if((bitmask&n)==0) {
			 System.out.println("Digit is Zero");  
		   }
		   else {
			   System.out.println("Digit is One");
		   }
		
		
	   }
	static void SetBit(int n,int pos) {
		  int bitmask=1<<pos; 
		  int newNo=bitmask|n;
		  System.out.println("new number after setbit = "+newNo);
	   }
	static void ClearBit(int n,int pos) {
		   int bitmask=1<<pos;
		   int notbit=~bitmask;
		   int newno=(notbit&n);
		   System.out.println("clear bit = "+newno);
	   }
	static void UpdateBit(int n,int pos,int updater) {
		   int bitmask=1<<pos;
		   if(updater==1) {
			   int newNo=bitmask|n;
			   System.out.println("new number after update with 1 = "+newNo);
		   }
		   else if(updater==0) {
			   int notbit=~bitmask;
			   int newno=(notbit&n);
			   System.out.println(" new number after update with 0 = "+newno);
		   }
		   else {
			   System.out.println("enter valid updater i.e, 0 or 1");
		   }
	   }
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for bit manipulation");
		  int n1=sc.nextInt();
		         System.out.println("enter  the position for setbit opperation");
		         int pos1=sc.nextInt();
		         SetBit(n1, pos1);
		         System.out.println("enter a number for bit manipulation");
		         int n2=sc.nextInt();
		                System.out.println("enter  the position for getbit opperation");
		                int pos2=sc.nextInt();
		                GetBit(n2, pos2);
		                System.out.println("enter a number for bit manipulation");
		                int n3=sc.nextInt();
		                       System.out.println("enter  the position for clearbit opperation");
		                       int pos3=sc.nextInt();
		                       ClearBit(n3, pos3);
		                       System.out.println("enter a number for bit manipulation");
		                       int n4=sc.nextInt();
		                              System.out.println("enter  the position for updatebit opperation");
		                              int pos4=sc.nextInt();
		                              System.out.println("enter updater either 0 or 1");
		                              int upd=sc.nextInt();
		                             UpdateBit(n4, pos4,upd);
         
	}

}

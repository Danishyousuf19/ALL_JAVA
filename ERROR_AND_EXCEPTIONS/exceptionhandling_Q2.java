import java.util.Scanner;

//Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
//exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.

public class exceptionhandling_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[4];
for (int i=0;i<arr.length;i++) {
			System.out.println("Enter Your favourite colours ");
			arr[i]=sc.next();
			}
try {
	System.out.println("Convert string to integer");
	int x=Integer.parseInt(arr[0]);
}
catch(NumberFormatException a) {
	System.out.println(a);
	
}
try {
	System.out.println("enter onr more  color");
	arr[arr.length]=sc.next();
}
catch  (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}

	}

}

//Sample run:
//Enter four colours
//RED
//BLUE
//YELLOW
//GREEN
//Convert string to integer
//java.lang.NumberFormatException: For input string: "RED"
//Enter one more colour
//VIOLET
//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of
//bounds for length 4
//The colours entered are
//RED
//BLUE
//YELLOW
//GREEN
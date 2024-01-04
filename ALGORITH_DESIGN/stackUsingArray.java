import java.util.Arrays;

public class stackUsingArray {
	static int top;
	static int maxsize = 10;
	

	stackUsingArray() {
		top = -1;
	arr	 = new int[maxsize];
	Arrays.fill(arr, -999);
	}

	static int arr[];

	static void push(int d) {
		if (top == maxsize - 1) {
			System.out.println("OverFlow");
			return;
		}
		arr[top++]=d;
		
	}
	static int pop() {
		if(top==-1) {
			System.out.println("UnderFlow");
			return -1;
		}
		else {
			int x=arr[top];
			arr[top]=-999;
			top--;
			
			return x;
		}
	}
	static int peek() {
		if(top==-1) {
			System.out.println("UnderFlow");
			return -1;
		}
		return arr[top];
	}
	static int size() {
		return top+1;
	}
	static void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}

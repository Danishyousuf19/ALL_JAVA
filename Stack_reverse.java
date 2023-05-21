import java.util.Stack;

public class Stack_reverse {
	public static void Push_at_bottom(Stack <Integer>s,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top =s.pop();
		Push_at_bottom(s,data);
		s.push(top);
		
	}
public static void reverse(Stack <Integer>s) {
	if(s.isEmpty()) {
		return;
		
	}
	int top=s.pop();
	reverse(s);
	Push_at_bottom(s,top);
	
}
	public static void main(String[] args) {
Stack <Integer>s=new Stack<>();
		
		s.push(2);
		s.push(5);
		s.push(9);
		s.push(332);
		s.push(54);
		s.push(94);
//		System.out.println("before");
//		while(!s.isEmpty()) {
//			System.out.println(s.peek());
//			s.pop();
//		}
		System.out.println("after ");
		reverse(s)
		;
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
//before
//94
//54
//332
//9
//5
//2
//after 
//2
//5
//9
//332
//54
//94

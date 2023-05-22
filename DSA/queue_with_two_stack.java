import java.util.*;



public class queue_with_two_stack {
	static class queue2{
		static Stack <Integer> s1=new Stack<>();
	static 	Stack <Integer> s2=new Stack<>();
static boolean isEmpty()

{
	return s1.isEmpty();
}
void add(int data) {
	while(!s1.isEmpty()) {
		s2.push(s1.pop());
	}
	s1.push(data);
	while(!s2.isEmpty()) {
		s1.push(s2.pop());
	}
	
}
int remove() {
	if(isEmpty()) {
		System.out.println("empty");return -1;
	}
	return s1.pop();
}
int peek() {
	if(isEmpty()) {
		System.out.println("empty");
		return -1;
	}
	return s1.peek();
}
	}
	public static void main(String[] args) {
		  queue2 q1 = new queue2();
	        q1.add(50);
	        q1.add(67);
	        q1.add(98);
	        q1.add(85);
	        System.out.println("remove"+q1.remove());
	        q1.add(555);
	        q1.add(7);
	        q1.add(8);
	        while (!q1.isEmpty()) {
	            System.out.println(q1.peek());
	            q1.remove();
	        }

	}

}
//remove50
//67
//98
//85
//555
//7
//8


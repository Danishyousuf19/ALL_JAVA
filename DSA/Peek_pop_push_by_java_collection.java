import java.util.*;

public class Peek_pop_push_by_java_collection {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(2);
		s.push(5);
		s.push(9);
		s.push(332);
		s.push(54);
		s.push(94);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
			
	}

}
//94
//54
//332
//9
//5
//2
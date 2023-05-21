import java.util.ArrayList;

import Stack_peek_push_pop.Stack;

public class ArrayLast_peek_pop_push {
static class Stack{
	static ArrayList <Integer> list =new ArrayList<>();
	
	public static boolean isempty() {
		return list.size()==0;
	}
	public static void  push(int data) {
		list.add(data);
	}
	public static int pop() {
		if (isempty()) {
			return -1;
		}
		int top=list.get(list.size()-1);
		list.remove(list.size()-1);
		return top;
		
	}
	public static int peek() {
		if (isempty()) {
			return -1;
		}
		return list.get(list.size()-1);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(2);
		s.push(5);
		s.push(9);
		s.push(332);
		s.push(54);
		s.push(94);
		while(!s.isempty()) {
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


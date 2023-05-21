
public class Stack_peek_push_pop {
static class node{
	int data;
	node next;
	public node (int data) {
		this.data=data;
		next=null;
	}
}
	static class  Stack{
		public static node head;
		public static boolean isempty() {
			return head==null;
		}
		public static void push(int data) {
			node newnode =new node (data);
			if(isempty())
			{
				head=newnode;
				return ;
			}
			newnode.next=head;
			head=newnode;
		}
		public static int pop() {
			if(isempty())
			{return -1;
				
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		public static int peek() {
			if(isempty()) {
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(2);
s.push(5);
s.push(9);
s.push(32);
s.push(54);
s.push(94);
while(!s.isempty()) {
	System.out.println(s.peek());
	s.pop();
}
	}

}

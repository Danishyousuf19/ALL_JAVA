
public class stackUsingLinkedList {
	static class node {
		int d;
		node next;

		node(int d) {
			this.d = d;
			next = null;
		}
	}

	static node head = null;

	public static boolean isempty() {
		return head == null;
	}

	static void push(int d) {
		node n = new node(d);
		if (isempty()) {
			head = n;
			return;
		}
		n.next = head;
		head = n;
	}

	static int pop() {
		if (isempty()) {
			return -999;
		}
		int top = head.d;
		head = head.next;
		return top;
	}

	static int peek() {
		if (isempty()) {
			return -999;
		}
		return head.d;
	}

	static void reverse() {
		if (!isempty()) {
			int x = pop();
			reverse();
			insertAtBottom(x);
		}
	}

	static void insertAtBottom(int x) {
		if (isempty()) {
			push(x);
		} else {
			int p = pop();
			insertAtBottom(p);
			push(p);
		}
	}
}

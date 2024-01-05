
public class linked_list {
	class node {
		int val;
		node next;

		node(int v) {
			val = v;
			next = null;
		}
	}

	node head;

	void display() {
		node temp = head;
		while (temp.next != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	void addfirst(int d) {
		node n = new node(d);
		n.next = head;
		head = n;

	}

	int removefirst() {
		if (head == null) {
			System.out.println("Underflow");
			return -1;
		}
		int t = head.val;
		head = head.next;
		return t;
	}

	int removelast() {

		if (head == null || head.next == null) {
			System.out.println("UngerFlow");
			return -1;
		}
		node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		int t = temp.val;
		temp.next = null;
		return t;

	}

	void addlast(int d) {
		if (head == null)
			addfirst(d);
		node n = new node(d);
		node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = n;
	}

	void addany(int d, int p) {
		node n = new node(d);
		if (head == null) {
			head = n;
		} else {
			node temp = head;
			while (temp.next != null && p > 2) {
				temp = temp.next;
				p--;
			}
			n.next = temp.next;
			temp.next = n;
		}
	}

	int deleteany(int p) {
		int res = -1;
		if (head == null)

		{
			System.out.println("UnderFlow");
			return res;
		} else if (p == 1) {
			res = head.val;
			head = head.next;
			return res;
		} else {

			node temp = head;
			while (temp.next != null && p > 2) {
				temp = temp.next;
				p--;
			}
			if (temp.next != null) {
				res = temp.next.val;
				temp.next = temp.next.next;
			}
		}
		return res;

	}

	void srch(int e) {
		node temp = head;
		while (temp != null) {
			if (temp.val == e) {
				System.out.println("Element found");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Element not found");

	}

	void reverse() {
		node c = head;
		node p = null;
		node n = null;
		while (c != null) {
			n = c.next;
			c.next = p;
			p = c;
			c = n;
		}
		head = p;
	}
}

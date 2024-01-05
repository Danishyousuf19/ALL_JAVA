
public class doubly_linked_list {
	class node {
		int d;
		node next, prev;

		node(int d) {
			this.d = d;
			next = null;
			prev = null;
		}
	}

	node head = null;
	node tail = null;

	void addfirst(int d) {
		node n = new node(d);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head.prev = n;
			head = n;
		}
	}

	void addlast(int d) {
		node n = new node(d);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			n.prev = tail;
			tail = n;
		}
	}

	void addany(int d, int p) {
		node n = new node(d);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			node temp = head;
			while (temp.next != null && p > 2) {
				p--;
				temp = temp.next;
			}
			n.next = temp.next;
			n.prev = temp;
			if (temp.next != null) {
				temp.next.prev = n;
				temp.next = n;
			}
		}

	}

	void removestart() {
		if (head == null || head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}

	}

	void removeend() {
		if (head == null || head == tail) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	void removeany(int p) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		node temp = head;
		while (temp.next != null && p > 2) {
			temp = temp.next;
			p--;
		}
		if (temp.next == null) {
			System.out.println("Invalid position");
			return;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;

	}

	 void display() {
		node temp = head;
		while (temp != null) {
			System.out.print(temp.d + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}

}

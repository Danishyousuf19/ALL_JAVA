public class queue_linked_list {

    static class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            next = null;
        }
    }

    static class queueLL {
        static node head = null;
        static node tail = null;

        static boolean isempty() {
            return head == null;
        }

        static void add(int data) {
            node new_node = new node(data);
            if (tail == null) {
                tail = head = new_node;
                return;
            }
            tail.next = new_node;
            tail = new_node;
        }

        static int remove() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        static int peek() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queueLL q1 = new queueLL();
        q1.add(50);
        q1.add(67);
        q1.add(98);
        q1.add(85);
        System.out.println("remove"+q1.remove());
        q1.add(555);
        q1.add(7);
        q1.add(8);
        while (!q1.isempty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
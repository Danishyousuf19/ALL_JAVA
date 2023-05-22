import  java.util.*;
public class queue_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer>q1=new LinkedList<>();
		Queue <Integer>q2=new ArrayDeque<>();
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

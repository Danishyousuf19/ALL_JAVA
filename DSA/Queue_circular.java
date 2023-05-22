
public class Queue_circular {

	static class queueCircle{
		static int arr[];
		static int size;
		static int front=-1;
		static int rear=-1;
		queueCircle(int a){
			this.size=a;
			arr=new int [size];
			
		}
	static 	boolean isEmpty() {
		return rear==-1&&front ==-1;
	}
	static boolean isfull() {
		return (rear+1)%size==front;
	}
	 void add (int data ) {
		if(isfull()) {
			System.out.println("full"); 
			return ;
		}
		if(front ==-1) {
			front =0;}
			rear=(rear+1)%size;
			arr[rear]=data;
		
	}
	 int remove() {
		if(isEmpty()) {
			System.out.println("Empty");
			return -1;
		}
		int result=arr[front];
		//single element condition
		if(rear==front) {
			rear=front=-1;
			
		}
		else {
			front =(front+1)%size;
			
		}
		return result;
	}
	 int peek() {
		if(isEmpty()) {
			System.out.println("empty");return -1;
		}
		return arr[front];
	}
	
	}
	public static void main(String[] args) {
		queueCircle q =new queueCircle(5);
		q.add(3);
		q.add(6);
		q.add(7);
		q.add(23);
		q.add(65);
		System.out.print("removing...");
	    System.out.println(q.remove());
		q.add(75);
		System.out.print("removing...");
		System.out.println(q.remove());
		q.add(66);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}
//	removing...3
//	removing...6
//	7
//	23
//	65
//	75
//	66


}

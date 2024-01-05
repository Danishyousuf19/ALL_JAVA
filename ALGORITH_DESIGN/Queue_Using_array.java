
public class Queue_Using_array {
static class queue {
	int size;
	static int  arr[];
	static int rear=-1;
	queue(int size){
		this.size=size;
		arr=new int[size];
	}
	boolean isempty() {
		return rear==-1;
	}
	void add(int data) {
		if(rear==(size-1)) {
			System.out.println("Full queue");return;
		}
		rear++;
		arr[rear]=data;
	}
	int remove() {
		if(isempty()) {
			System.out.println("Empty queue");return -1;
		}
		int front =arr[0];
		for (int i=0;i<rear;i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		return front;
		
	}
	int  peek() {
		if(isempty()) {
		System.out.println("Empty queue");return -1;
					}	
return(arr[0]);
	}
	
}
	public static void main(String[] args) {
		queue q=new queue(5);
		q.add(3);
		q.add(5);
		q.add(6);
		q.add(23);
		q.add(55);
		
		q.add(36);
		while(!q.isempty()) {
			//System.out.println(q.peek()); 
			q.remove(); 
			
		}

	}

}
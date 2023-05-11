package extra;	

public class Linked_list {
node head;
private int size;
Linked_list(){
	this.size=0;
}
	class node{
		
		String data;
		node next;
		node(String d){
			data=d;size++;
			this.next=null;
		}
	}
	
	public  void addFirst(String data) {
		node newnode=new node(data);
		if(head==null) {
			head =newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
		
	}
	public  void addLast(String data) {
		node newnode=new node(data);
		if(head==null) {
			head =newnode;
			return;
		}
		node current=head;
		while(current.next!=null) {
			current=current.next;}
			current.next=newnode;
		}
		public  void print() {
			
			if(head==null) {
				System.out.println("empty linkedlist");
				return;
			}
			node current=head;
			while(current!=null) {
				System.out.print(current.data+"-->");
				current=current.next;
			}
			System.out.println("null");
	}
		public  void DeleteFirst() {
			if(head==null){
				System.out.println("Empty list");
				return;
			}
			size--;
			head=head.next;
		}
		public  void DeleteLast() {
			if(head==null){
				System.out.println("Empty list");
				return;
			}
			size--;
			if(head.next==null) {
				head=null;
				return;
			}
			node secondLast=head;
			node last=head.next;
			while(last.next!=null) {
				last=last.next;
				secondLast=secondLast.next;
			}
			secondLast.next=null;
		}
		public  int getsize() {
			return size;
		}
		
	public static void main(String[] args) {
		Linked_list list=new Linked_list();
		list.addFirst("a");
		list.addFirst("is");
		list.print();
		list.addLast("book");
		list.print();
		list.addFirst("This");
		list.print();
		System.out.println("size = "+list.getsize());
        list.DeleteFirst();
        list.DeleteLast();
        list.print();
        System.out.println("size = "+list.getsize());
	}

}

package extra;
import java.util.*;
public class Linked_list_from_collection_frame_work {

	public static void main(String[] args) {
		LinkedList <String>list=new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
System.out.println(list);
		list.addLast("book");
System.out.println(list);
		list.addFirst("This");
System.out.println(list); 
for(int i=0;i<list.size();i++) {
        	if(list.get(i).equals("is")) {
        		System.out.println("found at index : "+i);
        		break;
        	}
        	
        }
for(int i=0;i<list.size();i++) {
	System.out.print(list.get(i)+"-->");
}
System.out.print("null\n");
		System.out.println("size = "+list.size());
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println("size = "+list.size());
	}

}
//[is, a]
//[is, a, book]
//[This, is, a, book]
//found at index : 1
//This-->is-->a-->book-->null
//size = 4
//[is, a, book]
//[is, a]
//[a]


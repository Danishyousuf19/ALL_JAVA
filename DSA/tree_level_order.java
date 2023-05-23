import java.util.*;
public class tree_level_order {
static class node{
	int data;
	node right;
	node left;
	node(int g){
		this.data=g	;
		right=null;
		left=null;
	}
}
static class binarytees{
static	int idx=-1;
node build(int nodes[]) {
	idx++;
	if(nodes[idx]==-1) {
		return null;
	}
	node nue=new node(nodes[idx]);
	nue.left=build(nodes);
	nue.right=build(nodes);
	return nue;
}
void levelorder(node root) {
	if(root==null)
		return;
	Queue <node> q=new LinkedList<>();
	q.add(root);
	q.add(null);
	while(!q.isEmpty()) {
		node current=q.remove();
		if(current==null) {
			System.out.println();
			if(q.isEmpty()) {
				break;
			}
			else {
				q.add(null);
			}
		}
		else {
			System.out.print(current.data+" ");
			if(current.left!=null) {
				q.add(current.left);
			}
			if(current.right!=null) {
				q.add(current.right);
			}
		}
	}
}
}
	public static void main(String[] args) {
		int[] nodes = {1,2,3,-1,-1,4,-1,-1,3,-1,6,-1,-1};
		binarytees tree=new binarytees();
node root =tree.build(nodes);
tree.levelorder(root);


	}

}
//1 
//2 3 
//3 4 6 


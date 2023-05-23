
public class tree_inorder_travelsal {
static class node {
	int data;
	node left;
	node right;
	node (int d){
		this.data=d;
		this.right=null;
		this.left=null;
	}
}
static class binarytre{
	static int idx=-1;
	static node build(int nodes[]) {
		idx++;
		if(nodes[idx]==-1) {
			return null;
		}
		node newnode=new node(nodes[idx]);
	newnode.left=build(nodes);
	newnode.right=build(nodes);
	return newnode;
		
	}
	 void inorder(node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
}
	public static void main(String[] args) {
		int nodes[]= {1,2,3,-1,-1,4,-1,-1,3,-1,6,-1,-1};
binarytre tree=new binarytre();
node root=tree.build(nodes);
 tree.inorder(root);
	}

}//3 2 4 1 3 6 
